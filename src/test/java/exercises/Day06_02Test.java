package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day06_02Test {

    private static Puzzle PUZZLE = new Day06_02();

    @Test
    public void testAdHoc() {
        String line1 = "";
        List<String> input = new ArrayList<>();
        input.add(line1);

        final int EXPECTED_SOLUTION = 0;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day06/part01/test-input-day-06-part-01-full.txt");

        final int EXPECTED_SOLUTION = 71503;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }
}
