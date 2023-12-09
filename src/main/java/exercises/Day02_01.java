package exercises;

import model.Puzzle;

import java.util.Arrays;
import java.util.List;

public class Day02_01 extends Puzzle {

    static final String RED = "red";
    static final String GREEN = "green";
    static final String BLUE = "blue";
    static final int LIMIT_RED = 12;
    static final int LIMIT_GREEN = 13;
    static final int LIMIT_BLUE = 14;

    @Override
    public <R> R solve(List<String> input) {
//        Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
//        Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
//        Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
//        Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
//        Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
        // Parse line at colon to get game
        // Parse at semi-colons to get rounds
        // Check each round and if any color exceeds the limits
        // If not, add game number to running sum


        for (String line : input) {
            String[] tokens = line.split(":");
            String[] gameTokens = tokens[0].split("Game ");
            String[] rounds = tokens[1].split(";");

            for (String round : rounds) {
                String[] cubes = round.split(",");

                for (String cube : cubes) {
                    String[] cubeData = cube.split(" ");
                    int qty = Integer.valueOf(cubeData[1]).intValue();
                    String color = cubeData[2];

                    if (color.equals(RED) && qty > LIMIT_RED) {
                        // skip
                    }

                    if (color.equals(GREEN) && qty > LIMIT_GREEN) {
                        // skip
                    }

                    if (color.equals(BLUE) && qty > LIMIT_BLUE) {
                        // skip
                    }
                }
            }

            int gameNumber = Integer.valueOf(gameTokens[1]);

            System.out.println(gameTokens[1]);
            System.out.println(Arrays.toString(tokens));
            System.out.println(Arrays.toString(rounds));
        }
        return (R) Integer.valueOf(1);
    }
}
