package task3.solution1;

/**
 * ref: https://www.codewars.com/kata/reviews/5e8b3fe0ab31b80001d9657e/groups/5e8b3fe1ab31b80001d96582
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected String camelCase(String input) {
        // перед началом каждой подстроки, которая начинается с upper case буквы от A до Z, ставится пробел.
        return input.replaceAll("([A-Z])", " $1");
    }
}
