package app;

import exercises.*;
import model.Puzzle;
import model.Solvable;
import utils.Utils;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String filePath = "/puzzle-input/input-day-04.txt";
        List<String> input = Utils.readLines(filePath);

        Puzzle puzzle = new Day04_02();
        Integer solution = puzzle.solve(input);
        System.out.println(solution.intValue());
    }

}