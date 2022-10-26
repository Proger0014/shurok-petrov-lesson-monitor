package task2.solution2;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * ref: https://www.codewars.com/kata/reviews/5559c4009f65514a9d0000b0/groups/555b84e8bea3c00d250000a4
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    private static HashMap<Character, Character> map = new HashMap<>(4);
    static {
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');
    }

    @Override
    protected String makeComplement(String dna) {
        return dna
                .chars()
                .mapToObj(c -> String.valueOf(map.get((char)c)))
                .collect(Collectors.joining()); // как в строку переводится?
    }
}
