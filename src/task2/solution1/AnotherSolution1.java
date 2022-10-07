package task2.solution1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * ref: https://www.codewars.com/kata/reviews/54ffcfb0c50295c6e40009f1/groups/55017f1afed40fc5b0000ebd
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected List<String> number(List<String> lines) {
        if (lines.size() == 0) return lines;
        return IntStream.range(0, lines.size())
                .mapToObj(n -> String.format("%d: %s", n + 1, lines.get(n)))
                .collect(Collectors.toList());
    }
}
