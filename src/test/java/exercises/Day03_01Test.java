package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03_01Test {

    private static Puzzle PUZZLE = new Day03_01();

    @Test
    public void testAdHoc() {
        String line1 = "1+1+234";
        String line2 = "43...45";
        List<String> input = new ArrayList<>();
        input.add(line1);
        input.add(line2);

        final int EXPECTED_SOLUTION = 279;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day03/part01/test-input-day-03-part-01-full.txt");

        final int EXPECTED_SOLUTION = 4361;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
