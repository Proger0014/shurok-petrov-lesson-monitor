package task2.solution4;

import java.util.stream.IntStream;

/**
 * ref: https://www.codewars.com/kata/reviews/56e09a5a8d75847def00002d/groups/5ad0b15dc92e77ccaf002a21
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected long numberOfDivisors(int n) {
        return IntStream
                .range(1, n + 1)
                .reduce(0, (acc, x) -> n % x == 0 ? acc + 1 : acc); // acc - это identity, который равен 0... Крч, counter. x -> range
    }
}
