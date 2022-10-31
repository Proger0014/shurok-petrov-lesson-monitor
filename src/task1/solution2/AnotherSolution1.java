package task1.solution2;

import java.util.Arrays;

public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected String[] unusualLexOrder(String[] words) {
        return Arrays.stream(words)
                .sorted((w1, w2) -> compRev(w1, w2)) // сначала сортирует, потом в новый массив?
                .toArray(String[]::new); // либо же, сначала отсортирует первую пару, создаст новый массив, потом дальше добавляет в массив?
    }

    private static int compRev(String w1, String w2) {
        String a = new StringBuilder(w1).reverse().toString(),
               b = new StringBuilder(w2).reverse().toString();

        return a.compareTo(b); // уже работает, как надо???
    }
}
