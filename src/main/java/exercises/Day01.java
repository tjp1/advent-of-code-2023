package exercises;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Day01 implements Solveable {

    private final String FILE_PATH = "/puzzle-input/input-day-01.txt";
    private List<String> input;

    public Day01() {
        input = prepareInput();
    }

    private List<String> prepareInput() {
        return Utils.readLines(FILE_PATH);
    }
    public <R> R solve() {
        return null;
    }

}
