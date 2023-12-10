package exercises;

import model.Puzzle;

import java.util.*;

public class Day03_01 extends Puzzle {

    @Override
    public <R> R solve(List<String> input) {
        char[][] matrix = parseInput(input);
        Set<String> adjacentLocations = findSymbolRadius(matrix);

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int idxStart = -1;
            int idxEnd = -1;

            for (int j = 0; j < matrix[i].length; j++) {
                if (Character.isDigit(matrix[i][j])) {

                    // First digit is identified
                    if (idxStart < 0) {
                        idxStart = j;
                    }

                    // Update where the number may end
                    idxEnd = j;
                }

                    // We've gone past the end of a number or we're at the end of a line
                    if (!(idxStart == -1 && idxEnd == -1) && (j + 1 == matrix[i].length || !Character.isDigit(matrix[i][j + 1]))) {
                        // Pull substring between start / end
                        String numString = String.copyValueOf(matrix[i], idxStart, idxEnd - idxStart + 1);
                        Integer num = Integer.valueOf(numString);
                        Set<String> numRange = new HashSet<>();

                        String loc = null;

                        // Enumerate locations between start/end and map to number
                        for (int k = idxStart; k <= idxEnd; k++) {
                            loc = i + " " + k;
                            numRange.add(loc);
                        }

                        // Check if this number range intersects radius of symbol
                        Set<String> checkSet = new HashSet<>(numRange);
                        checkSet.retainAll(adjacentLocations);

                        // Add if intersecting
                        if (!checkSet.isEmpty()) {
                            sum += num.intValue();
                        }

                        // Reset found number range
                        idxStart = -1;
                        idxEnd = -1;
                    }
            }
        }

        return (R) Integer.valueOf(sum);
    }

    private char[][] parseInput(List<String> input) {
        int rowSize = input.size();
        int colSize = input.get(0).length();
        char[][] matrix = new char[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            String line = input.get(i);
            for (int j = 0; j < colSize; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        return matrix;
    }

    private Set<String> findSymbolRadius(char[][] matrix) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Non-period, non-digit character indentified
                if (!Character.isDigit(matrix[i][j]) && matrix[i][j] != '.') {
                    for (int m = -1; m <= 1; m++) {
                        for (int n = -1; n <= 1; n++) {
                            int row = i + m;
                            int col = j + n;

                            if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[i].length) {
                                set.add((i + m) + " " + (j + n));
                            }

                        }
                    }
                }
            }
        }

        return set;
    }

}
