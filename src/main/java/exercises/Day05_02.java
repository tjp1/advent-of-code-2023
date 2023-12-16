package exercises;

import model.Puzzle;

import java.util.*;

public class Day05_02 extends Puzzle {

    @Override
    public <R> R solve(List<String> input) {
        List<Long> seedValues = readSeeds(input.get(0));
        List<List<Long>> seeds = expandRanges(seedValues);

        Iterator<String> iterator = input.listIterator();
        boolean mapFound = false;
        List<List<List<Long>>> maps = new ArrayList<>();
        List<List<Long>> mapInput = new ArrayList<>();
        String line = null;


        while (iterator.hasNext()) {
            line = iterator.next();

            if (line.contains("map")) {
                mapFound = true;
            } else if (line.equals("") && mapFound) {
                maps.add(mapInput);
                // Reset vars
                mapFound = false;
                mapInput = new ArrayList<>();
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

                mapInput.add(row);
            }
        }

        maps.add(mapInput);

        // Finished reading numbers for a map, now run them through map
        // TODO: refactor this to iterate over ranges
        for (int i = 0; i < seeds.size(); i++) {
            List<Long> row = seeds.get(i);
            for (int j = 0; j < row.size(); j++) {
                long seed = row.get(j);
                for (List<List<Long>> map : maps) {
                    for (List<Long> range : map) {
                        long destRangeStart = range.get(0);
                        long rangeStart = range.get(1);
                        long rangeLength = range.get(2);
                        long rangeEnd = rangeStart + rangeLength - 1;

                        if (seed >= rangeStart && seed <= rangeEnd) {
                            seed += (destRangeStart - rangeStart);
                            row.set(j, seed);
                            break;
                        }
                    }
                }
            }
        }

        long min = Integer.MAX_VALUE;

        for (List<Long> row : seeds) {
            for (Long seed : row) {
                if (seed < min) {
                    min = seed;
                }
            }
        }

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

    private List<List<Long>> expandRanges(List<Long> seedValues) {
        List<List<Long>> temp = new ArrayList<>();
        for (int i = 0; i < seedValues.size(); i += 2) {
            List<Long> range = new ArrayList<>();
            long rangeStart = seedValues.get(i);
            long rangeEnd = rangeStart + seedValues.get(i + 1);

            for (long j = rangeStart; j < rangeEnd; j++) {
                range.add(j);
            }

            temp.add(range);
        }

        return temp;
    }

}
