package task2.solution1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * ref: https://www.codewars.com/kata/reviews/54ffcfb0c50295c6e40009f1/groups/5585d18d4f7c65ab6e000083
 */
public class AnotherSolution3 extends AbstractSolutionTemplate {
    @Override
    protected List<String> number(List<String> lines) {
        final AtomicInteger index = new AtomicInteger(1);

        return lines.stream()
                .map(s -> String.valueOf(index.getAndIncrement() + ": " + s))
                .collect(Collectors.toList());
    }
}
