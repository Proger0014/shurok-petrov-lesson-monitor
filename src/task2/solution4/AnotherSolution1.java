package task2.solution4;

import java.util.stream.IntStream;

/**
 * ref: https://www.codewars.com/kata/reviews/56e09a5a8d75847def00002d/groups/591c95874633f957ec000227
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected long numberOfDivisors(int n) {
        return IntStream
                .range(1, n + 1)
                .filter(i -> n % i == 0)
                .count();
    }
}
