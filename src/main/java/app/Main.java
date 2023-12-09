package app;

import exercises.Day01;
import model.Solvable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solvable puzzle = new Day01("input-day-01.txt");
        Integer solution = puzzle.solve();
        System.out.println(solution.intValue());
    }

}