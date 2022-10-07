package task2.solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractSolutionTemplate {
    public void run(String... args) {
        List<String> target = new ArrayList<>();

        target.addAll(Arrays.asList(args));

        List<String> resultLines = number(target);

        for (String line : resultLines) {
            System.out.println(line);
        }

        System.out.println();
    }

    protected abstract List<String> number(List<String> lines);
}
