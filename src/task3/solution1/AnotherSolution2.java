package task3.solution1;

import java.util.stream.Collectors;

/**
 * ref: https://www.codewars.com/kata/reviews/5e8b3fe0ab31b80001d9657e/groups/5e8c8450ec33680001b5755b
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected String camelCase(String input) {
        return input
                .chars()
                .mapToObj(ch -> Character.isUpperCase(ch) ? " " + String.valueOf((char) ch) : String.valueOf((char) ch))
                .collect(Collectors.joining());
    }
}
