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

        List<String> input = new ArrayList<>();
        input.add(line1); // 1 + 7

        final int EXPECTED_SOLUTION = 8;
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
