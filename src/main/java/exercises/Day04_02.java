package exercises;

import model.Puzzle;

import java.net.Inet4Address;
import java.util.*;

public class Day04_02 extends Puzzle {

    // Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
    @Override
    public <R> R solve(List<String> input) {
        int sum = 0;
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

            // count number of matching numbers in this card
            Set<Integer> numMatches = new HashSet<>(chosenNumbers);
            numMatches.retainAll(winningNumbers);

            // For winning game X with Y matching numbers, add Y number of subsequent cards
            if (numMatches.size() > 0) {
                winCounts.put(gameNumber, numMatches.size());
                addNumsToQueue(queue, gameNumber + 1, gameNumber + numMatches.size());
            }
        }

        // process nums in queue
        while (!queue.isEmpty()) {
            Integer popped = queue.poll();
            int gameNumber = popped.intValue();

            // count every card that is dequeued
            sum++;

            // For winning game X with Y matching numbers, add Y number of subsequent cards
            if (popped != null && winCounts.containsKey(popped)) {
                int numMatches = winCounts.get(popped);
                addNumsToQueue(queue, gameNumber + 1, gameNumber + numMatches);
            }
        }

        // every card in input is counted at least once
        sum += input.size();

        return (R) Integer.valueOf(sum);
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
