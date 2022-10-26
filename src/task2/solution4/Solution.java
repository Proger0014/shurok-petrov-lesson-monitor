package task2.solution4;

/**
 * name: Count the divisors of a number
 * ref: https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected long numberOfDivisors(int n) {
        long count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }
}
