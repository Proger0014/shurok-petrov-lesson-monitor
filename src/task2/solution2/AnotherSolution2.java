package task2.solution2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * ref: https://www.codewars.com/kata/reviews/5559c4009f65514a9d0000b0/groups/60d63d73c33a5b0001a544c7
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    private static final Map<String, String> compliments = Map.of(
            "A", "T",
            "T", "A",
            "C", "G",
            "G", "C"
    );

    @Override
    protected String makeComplement(String dna) {
        if (dna == null || dna.isEmpty()) {
            throw new IllegalStateException(String.format("DNA is either null or empty: %s", dna));
        }

        char[] characters = dna.toCharArray();

        return IntStream
                .range(0, characters.length)
                .mapToObj(index -> characters[index])
                .map(c -> Character.toString(c))
                .map(compliments::get) // передача делегата метода
                .collect(Collectors.joining());
    }
}
