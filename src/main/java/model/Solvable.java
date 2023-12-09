package model;

import java.util.List;

public interface Solvable {

    public <R> R solve(List<String> input);
}
