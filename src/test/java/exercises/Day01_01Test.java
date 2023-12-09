package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01_01Test {

    private static Puzzle PUZZLE = new Day01_01();

    @Test
    public void testAdHoc() {
        final String SAMPLE_STRING = "ztxbmttzvldljxrtt142tkfrfivesevenfive";
        List<String> input = List.of(SAMPLE_STRING);

        final int EXPECTED_SOLUTION = 12;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day01/part01/test-input-day-01-part-01-full.txt");

        final int EXPECTED_SOLUTION = 142;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFirstLine() {
        List<String> input = Utils.readLines("/test-input/day01/part01/test-input-day-01-part-01-01.txt");

        final int EXPECTED_SOLUTION = 12;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSecondLine() {
        List<String> input = Utils.readLines("/test-input/day01/part01/test-input-day-01-part-01-02.txt");

        final int EXPECTED_SOLUTION = 38;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testThirdLine() {
        List<String> input = Utils.readLines("/test-input/day01/part01/test-input-day-01-part-01-03.txt");

        final int EXPECTED_SOLUTION = 15;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFourthLine() {
        List<String> input = Utils.readLines("/test-input/day01/part01/test-input-day-01-part-01-04.txt");

        final int EXPECTED_SOLUTION = 77;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
