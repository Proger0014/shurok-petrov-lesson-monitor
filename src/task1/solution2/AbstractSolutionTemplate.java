package task1.solution2;

import java.util.Arrays;

public abstract class AbstractSolutionTemplate {
    public void run(String[] words) {
        String[] result = unusualLexOrder(words);
        System.out.println(Arrays.toString(result));
        System.out.println();
    }

    protected abstract String[] unusualLexOrder(String[] words);
}
