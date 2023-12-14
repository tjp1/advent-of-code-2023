package exercises;

import model.Puzzle;

import java.net.Inet4Address;
import java.util.*;

public class Day04_02 extends Puzzle {

    // Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
    @Override
    public <R> R solve(List<String> input) {
        int sum = 0;
        int scratchCardTotal = 0;
        int totalGames = input.size();
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> winCounts = new HashMap<>();

        // for each line
        for (String line : input) {
            // parse line
            String[] tokens = line.split(":");
            String[] gameInfo = tokens[0].split("Card\s+");
            int gameNumber = Integer.valueOf(gameInfo[1].trim());
            String lotteryInfo = tokens[1];
            String[] lotteryNumbers = lotteryInfo.split("\\|");
            String winningNumbersString = lotteryNumbers[0].trim();
            String chosenNumbersString = lotteryNumbers[1].trim();

            Set<Integer> winningNumbers = parseNumbers(winningNumbersString);
            Set<Integer> chosenNumbers = parseNumbers(chosenNumbersString);
            Set<Integer> checkSet = new HashSet<>(chosenNumbers);
            checkSet.retainAll(winningNumbers);

            if (checkSet.size() > 0) {
                winCounts.put(gameNumber, checkSet.size());

                addNumsToQueue(queue, gameNumber + 1, Math.min(gameNumber + checkSet.size(), totalGames));
                scratchCardTotal++;
            }
        }

        // process nums in queue
        while (!queue.isEmpty()) {
            Integer popped = queue.poll();
            int winningCardNum = popped.intValue();

            // For winning game X with Y matching numbers, add Y number of subsequent cards
            if (popped != null && winCounts.containsKey(popped)) {
                addNumsToQueue(queue, winningCardNum + 1, Math.min(winningCardNum + winCounts.get(winningCardNum), totalGames));
                scratchCardTotal++;
            }
        }

        return (R) Integer.valueOf(scratchCardTotal);
    }

    private void addNumsToQueue(Queue<Integer> queue, int start, int stop) {
        for (int i = start; i <= stop; i++) {
            queue.add(Integer.valueOf(i));
        }
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
