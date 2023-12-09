package exercises;

import model.Puzzle;
import model.Solvable;

import java.util.List;

public class Day01 extends Puzzle implements Solvable {

    private List<String> input;

    public Day01(String filePath) {
        super(filePath);
        input = getPuzzleInput();
    }

    public <R> R solve() {
        int sum = 0;

        for (String line : input) {
            sum += seek(line);
        }

        return (R) Integer.valueOf(sum);
    }

    private int seek(String line) {
        final char ZERO = '0';
        int lineLength = line.length();
        int leftPtr = 0;
        int rightPtr = 0;

        // seek number from left
        for (int i = 0; i < lineLength; i++) {
            if (Character.isDigit(line.charAt(i))) {
                leftPtr = i;
                break;
            }
        }

        // seek number from right
        for (int i = lineLength - 1; i >= 0; i--) {
            if (Character.isDigit(line.charAt(i))) {
                rightPtr = i;
                break;
            }
        }

        int leftDigit = line.charAt(leftPtr) - ZERO;
        int rightDigit = line.charAt(rightPtr) - ZERO;

        leftDigit *= 10;
        int lineSum = leftDigit + rightDigit;

        return lineSum;
    }

}
