package exercises;

import model.Puzzle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day04_01 extends Puzzle {

    // Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
    @Override
    public <R> R solve(List<String> input) {
        int sum = 0;
        int points = 0;

        // for each line
        for (String line : input) {
            // parse line
            String[] tokens = line.split(":");
            String lotteryInfo = tokens[1];
            String[] lotteryNumbers = lotteryInfo.split("\\|");
            String winningNumbersString = lotteryNumbers[0].trim();
            String chosenNumbersString = lotteryNumbers[1].trim();

            Set<Integer> winningNumbers = parseNumbers(winningNumbersString);
            Set<Integer> chosenNumbers = parseNumbers(chosenNumbersString);
            Set<Integer> checkSet = new HashSet<>(chosenNumbers);
            checkSet.retainAll(winningNumbers);

            points = (int) Math.pow(2, checkSet.size() - 1);
            sum += points;

            // reset
            points = 0;
        }

        return (R) Integer.valueOf(sum);
    }

    private Set<Integer> parseNumbers(String line) {
        String[] numbers = line.split(" ");
        Set<Integer> set = new HashSet<>();

        for (String number : numbers) {
            if (number.length() > 0) {
                set.add(Integer.valueOf(number));
            }
        }

        return set;
    }

}
