package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01_02Test {

    private static Puzzle PUZZLE = new Day01_02();

    @Test
    public void testAdHoc() {
        final String SAMPLE_STRING = "ztxbmttzvldljxrtt142tkfrfivesevenfive";
        List<String> input = List.of(SAMPLE_STRING);

        final int EXPECTED_SOLUTION = 15;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-full.txt");

        final int EXPECTED_SOLUTION = 281;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFirstLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-01.txt");

        final int EXPECTED_SOLUTION = 29;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSecondLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-02.txt");

        final int EXPECTED_SOLUTION = 83;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testThirdLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-03.txt");

        final int EXPECTED_SOLUTION = 13;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFourthLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-04.txt");

        final int EXPECTED_SOLUTION = 24;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFifthLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-05.txt");

        final int EXPECTED_SOLUTION = 42;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSixthLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-06.txt");

        final int EXPECTED_SOLUTION = 14;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSeventhLine() {
        List<String> input = Utils.readLines("/test-input/day01/part02/test-input-day-01-part-02-07.txt");

        final int EXPECTED_SOLUTION = 76;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }


}
