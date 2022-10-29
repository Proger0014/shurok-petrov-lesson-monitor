package task1.solution2;

import java.util.Arrays;
import java.util.Comparator;

public class AnotherSolution3 extends AbstractSolutionTemplate {
    @Override
    protected String[] unusualLexOrder(String[] words) {
        return Arrays.stream(words)
                .sorted(Comparator.comparing(x -> new StringBuilder(x).reverse().toString()))
                .toArray(String[]::new);
    }
}
