package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02_01Test {

    private static Puzzle PUZZLE = new Day02_01();

    @Test
    public void testAdHoc() {
        final String SAMPLE_STRING = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";
        List<String> input = List.of(SAMPLE_STRING);

        final int EXPECTED_SOLUTION = 1;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-full.txt");

        final int EXPECTED_SOLUTION = 8;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFirstLine() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-01.txt");

        final int EXPECTED_SOLUTION = 1;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSecondLine() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-02.txt");

        final int EXPECTED_SOLUTION = 2;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testThirdLine() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-03.txt");

        final int EXPECTED_SOLUTION = 0;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFourthLine() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-04.txt");

        final int EXPECTED_SOLUTION = 0;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFifthLine() {
        List<String> input = Utils.readLines("/test-input/day02/part01/test-input-day-02-part-01-05.txt");

        final int EXPECTED_SOLUTION = 5;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
