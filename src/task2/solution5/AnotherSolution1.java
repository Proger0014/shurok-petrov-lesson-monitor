package task2.solution5;

import java.util.Arrays;

/**
 * ref: https://www.codewars.com/kata/reviews/5b6bac5fecd097af73000cbe/groups/5b6c036c42946ba7c700121e
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected boolean isAscOrder(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);

        return Arrays.equals(copyArr, arr);
    }
}
