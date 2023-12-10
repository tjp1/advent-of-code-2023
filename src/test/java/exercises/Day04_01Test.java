package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04_01Test {

    private static Puzzle PUZZLE = new Day04_01();

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
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-full.txt");

        final int EXPECTED_SOLUTION = 13;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFirstLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-01.txt");

        final int EXPECTED_SOLUTION = 8;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSecondLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-02.txt");

        final int EXPECTED_SOLUTION = 2;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testThirdLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-03.txt");

        final int EXPECTED_SOLUTION = 2;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFourthLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-04.txt");

        final int EXPECTED_SOLUTION = 1;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFifthLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-05.txt");

        final int EXPECTED_SOLUTION = 0;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testSixthLine() {
        List<String> input = Utils.readLines("/test-input/day04/part01/test-input-day-04-part-01-06.txt");

        final int EXPECTED_SOLUTION = 0;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
