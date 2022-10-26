package task2.solution3;

/**
 * name: Cats and shelves
 * ref: https://www.codewars.com/kata/62c93765cef6f10030dfa92b/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected int solution(int start, int finish) {
        int jumps = 0;

        int diff = finish - start;

        if (diff < 3) {
            jumps += diff;
        } else {
            int jumpsToFour = diff / 3;
            int remainderJumps = diff - jumpsToFour * 3;

            jumps = jumpsToFour + remainderJumps;
        }

        return jumps;
    }
}
