package task2.solution1;

import java.util.List;

/**
 * ref: https://www.codewars.com/kata/reviews/54ffcfb0c50295c6e40009f1/groups/55027a7d34137e55e40007ca
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, (i + 1) + ": " + lines.get(i)); // lines.set(i, String.format("%d: %s", i + 1, lines.get(i));
        }

        return lines;
    }
}
