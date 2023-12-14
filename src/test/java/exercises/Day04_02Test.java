package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04_02Test {

    private static Puzzle PUZZLE = new Day04_02();

    @Test
    public void testAdHoc() {
        String line1 = "Card   1:  4 33 89 61 95 36  5 30 26 55 | 15 33 28 36 93 57 26 13 95  4 18 79  6 87 60 66 69 67 19 42 22 61 78  5 58";
        String line2 = "Card   2:  9 16 48 75 82 61 56 91  3 27 |  4 12 96 20 22 13  6 86 61 94 95 30  9 75 56 38 26 28  7 16 42 55  2 34  8";
        String line3 = "Card   3: 91 74 25 36 96 64 70 48 93 89 | 67 86 52 89 19 91 48 64 23 72  6 80 58 96 74 15 35 10 70 63 25 14 87 93 36";

        List<String> input = new ArrayList<>();
        input.add(line1); // 7
        input.add(line2); // 5
        input.add(line3); // 10

        final int EXPECTED_SOLUTION = 7;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day04/part02/test-input-day-04-part-02-full.txt");

        final int EXPECTED_SOLUTION = 30;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
