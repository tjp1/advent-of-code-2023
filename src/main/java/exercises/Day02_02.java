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
        int sum = 0;

        // Parse line
        for (String line : input) {
            String[] tokens = line.split(":");
            String[] gameTokens = tokens[0].split("Game ");
            String[] rounds = tokens[1].split(";");
            int gameNumber = Integer.valueOf(gameTokens[1]).intValue();
            boolean skip = false;

            // Parse sub-games
            for (String round : rounds) {
                String[] cubes = round.split(",");

                // Parse cube info
                for (String cube : cubes) {
                    String[] cubeData = cube.split(" ");
                    String color = cubeData[2];
                    int qty = Integer.valueOf(cubeData[1]).intValue();

                    // Don't count if sub-game exceeds cube limits
                    if ((color.equals(RED) && qty > LIMIT_RED)
                        || (color.equals(GREEN) && qty > LIMIT_GREEN)
                        || (color.equals(BLUE) && qty > LIMIT_BLUE)) {
                        skip = true;
                        break;
                    }
                }
            }

            if (!skip) {
                sum += gameNumber;
            }
        }

        return (R) Integer.valueOf(sum);
    }
}
