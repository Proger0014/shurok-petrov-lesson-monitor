package task1.solution2;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected String[] unusualLexOrder(String[] words) {
        return Arrays.stream(words).parallel()
                .map(StringUtils::reverse) // хрень, можно было использовать StringBuilder
                .sorted()
                .map(StringUtils::reverse)
                .toArray(String[]::new);
    }
}
