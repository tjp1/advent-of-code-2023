package exercises;

import model.Puzzle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day06_01 extends Puzzle {

    @Override
    public <R> R solve(List<String> input) {
        int result = 1;
        int[][] races = parseNumbers(input);

        // for each race
        for (int i = 0; i < races.length; i++) {
            int time = races[i][0];
            int distance = races[i][1];
            int count = 0;

            for (int j = 0; j < time; j++) {
                if (j * (time - j) > distance) {
                    count++;
                }
            }

            if (count > 0) {
                result *= count;
            }
        }

        return (R) Integer.valueOf(result);
    }

    private int[][] parseNumbers(List<String> input) {
        String[] strTimes = input.get(0).split("Time:")[1].trim().split("\\s+");
        String[] strDistances = input.get(1).split("Distance:")[1].trim().split("\\s+");
        int[][] races = new int[strTimes.length][2];

        for (int i = 0; i < races.length; i++) {
            races[i][0] = Integer.parseInt(strTimes[i]); // time
            races[i][1] = Integer.parseInt(strDistances[i]); // distance
        }

        return races;
    }

}
