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
        String line1 = "Card  10: 70 13 57 30 27 31 12 29 82 38 | 28 44 43 82 71 15 14 74 38 72 26 83 29 96 30 77 66 27 51  9 84 68 57 64 32";
        List<String> input = new ArrayList<>();
        input.add(line1);

        final int EXPECTED_SOLUTION = 0;
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
