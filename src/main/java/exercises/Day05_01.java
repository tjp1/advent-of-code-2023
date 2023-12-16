package exercises;

import model.Puzzle;

import java.util.*;

public class Day05_01 extends Puzzle {

    @Override
    public <R> R solve(List<String> input) {
        List<Long> seedValues = readSeeds(input.get(0));

        Iterator<String> iterator = input.listIterator();
        boolean mapFound = false;
        List<List<Long>> map = new ArrayList<>();
        String line = null;

        while (iterator.hasNext()) {
            line = iterator.next();

            if (line.contains("map")) {
                mapFound = true;
            } else if (line.equals("") && mapFound) {
                // Finished reading numbers for a map, now run them through map
                for (int i = 0; i < seedValues.size(); i++) {
                    long tempSeed = seedValues.get(i);

                    for (List<Long> row : map) {
                        long destRangeStart = row.get(0);
                        long rangeStart = row.get(1);
                        long rangeLength = row.get(2);
                        long rangeEnd = rangeStart + rangeLength - 1;

                        if (tempSeed >= rangeStart && tempSeed <= rangeEnd) {
                            tempSeed += (destRangeStart - rangeStart);
                            seedValues.set(i, tempSeed);
                            break;
                        }
                    }
                }

                // Reset vars
                mapFound = false;
                map = new ArrayList<>();
            } else if (mapFound) {
                // Parse numbers in row
                List<Long> row = new ArrayList<>();
                String[] stringNums = line.trim().split(" ");
                Long destRangeStart = Long.parseLong(stringNums[0]);
                Long srcRangeStart = Long.parseLong(stringNums[1]);
                Long rangeLength  = Long.parseLong(stringNums[2]);

                row.add(destRangeStart);
                row.add(srcRangeStart);
                row.add(rangeLength);

                map.add(row);
            }
        }

        int min = seedValues.stream().min(Comparator.naturalOrder()).get().intValue();

        return (R) Long.valueOf(min);
    }

    private List<Long> readSeeds(String line) {
        String[] tokens = line.split("seeds: ");
        String stringNumList = tokens[1].trim();
        String[] stringNums = stringNumList.split(" ");

        List<Long> nums = new ArrayList<>();

        for (String num : stringNums) {
            nums.add(Long.valueOf(num));
        }

        return nums;
    }

}
