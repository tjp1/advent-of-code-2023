package exercises;

import model.Puzzle;

import java.util.List;

public class Day02_02 extends Puzzle {

    static final String RED = "red";
    static final String GREEN = "green";
    static final String BLUE = "blue";

    @Override
    public <R> R solve(List<String> input) {
        int sum = 0;

        // Parse line
        for (String line : input) {
            String[] tokens = line.split(":");
            String[] gameTokens = tokens[0].split("Game ");
            String[] rounds = tokens[1].split(";");

            int power = 0;
            int maxRed = 0;
            int maxGreen = 0;
            int maxBlue = 0;

            // Parse sub-games
            for (String round : rounds) {
                String[] cubes = round.split(",");

                // Parse cube info
                for (String cube : cubes) {
                    String[] cubeData = cube.split(" ");
                    String color = cubeData[2];
                    int qty = Integer.valueOf(cubeData[1]).intValue();

                    // Calculate min necessary cubes per color
                    if (color.equals(RED) && qty > maxRed) {
                        maxRed = qty;
                    }

                    if (color.equals(GREEN) && qty > maxGreen) {
                        maxGreen = qty;
                    }

                    if (color.equals(BLUE) && qty > maxBlue) {
                        maxBlue = qty;
                    }
                }
            }

            power = maxRed * maxGreen * maxBlue;

            sum += power;
        }

        return (R) Integer.valueOf(sum);
    }
}
