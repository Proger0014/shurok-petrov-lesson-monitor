package task3.solution2;

import java.util.Arrays;

/**
 * ref: https://www.codewars.com/kata/reviews/54da5d0598b8a2ad76000246/groups/5590de015673465fe6000015
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected int findIt(int[] a) {
        return Arrays
                .stream(a)
                .reduce(0, (x, y) -> x ^ y); // identity - как результат. x - identity, y - currentA
    }
}
