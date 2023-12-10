package exercises;

import model.Puzzle;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03_02Test {

    private static Puzzle PUZZLE = new Day03_02();

    @Test
    public void testAdHoc() {
        String line1 = "467..114..";
        String line2 = "...*......";
        String line3 = "..35..633.";
        List<String> input = new ArrayList<>();
        input.add(line1);
        input.add(line2);
        input.add(line3);

        final int EXPECTED_SOLUTION = 16345;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

    @Test
    public void testFullExample() {
        List<String> input = Utils.readLines("/test-input/day03/part02/test-input-day-03-part-02-full.txt");

        final int EXPECTED_SOLUTION = 467835;
        int actualSolution = ((Integer) PUZZLE.solve(input)).intValue();

        assertEquals(EXPECTED_SOLUTION, actualSolution, String.format("Expected: %d but received %d", EXPECTED_SOLUTION, actualSolution));
    }

}
