package model;

import utils.Utils;

import java.util.List;

public abstract class Puzzle {

    private final String filePath;

    public Puzzle(String filePath) {
        String INPUT_FOLDER = "/puzzle-input";
        this.filePath = String.format("%s/%s", INPUT_FOLDER, filePath);
    }

    public List<String> getPuzzleInput() {
        return Utils.readLines(filePath);
    }
}
