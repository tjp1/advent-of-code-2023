package exercises;

import model.Puzzle;
import model.Solvable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day01_02 extends Puzzle {

    public <R> R solve(List<String> input) {
        int sum = 0;

        for (String line : input) {
            sum += seek(line);
        }

        return (R) Integer.valueOf(sum);
    }

    private int seek(String line) {
        final char ZERO = '0';
        Map<String, Integer> map = new HashMap<>();
        map.put("one", null);
        map.put("two", null);
        map.put("three", null);
        map.put("four", null);
        map.put("five", null);
        map.put("six", null);
        map.put("seven", null);
        map.put("eight", null);
        map.put("nine", null);

        int lineLength = line.length();
        int leftNumPtr = lineLength;
        int rightNumPtr = -1;
        int leftWordPtr = lineLength;
        int rightWordPtr = -1;
        int leftDigit = 0;
        int rightDigit = 0;
        String leftNumWord = null;
        String rightNumWord = null;
        boolean found = false;

        // Seek literal number from left
        for (int i = 0; i < lineLength; i++) {
            if (Character.isDigit(line.charAt(i))) {
                leftNumPtr = i;
                found = true;
            }

            // Update start positions of written numbers
            for (String key : map.keySet()) {
                if (line.substring(0, i).contains(key)) {
                    map.replace(key, line.indexOf(key));
                    found = true;
                }
            }

            if (found) {
                break;
            }
        }

        found = false;

        // Seek literal number from right
        for (int i = lineLength - 1; i >= 0; i--) {
            if (Character.isDigit(line.charAt(i))) {
                rightNumPtr = i;
                found = true;
            }

            // Update start positions of written numbers
            for (String key : map.keySet()) {
                if (line.substring(i, lineLength).contains(key)) {
                    map.replace(key, line.indexOf(key));
                    found = true;
                }
            }

            if (found) {
                break;
            }
        }

        // Identify start positions
        for (Map.Entry<String, Integer> entry : map.entrySet()){

            // Find start of first word
            if (entry.getValue() != null && entry.getValue() < leftWordPtr) {
                leftWordPtr = entry.getValue();
                leftNumWord = entry.getKey();
            }

            // Find start of last word
            if (entry.getValue() != null && entry.getValue() > rightWordPtr) {
                rightWordPtr = entry.getValue();
                rightNumWord = entry.getKey();
            }
        }

        leftDigit = leftNumPtr <= leftWordPtr ? line.charAt(leftNumPtr) - ZERO : getDigitValue(leftNumWord);
        rightDigit = rightNumPtr >= rightWordPtr ? line.charAt(rightNumPtr) - ZERO : getDigitValue(rightNumWord);


        leftDigit *= 10;
        int lineSum = leftDigit + rightDigit;

        return lineSum;
    }

    private int getDigitValue(String num) {
        switch (num) {
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            default: return 0;
        }
    }

}
