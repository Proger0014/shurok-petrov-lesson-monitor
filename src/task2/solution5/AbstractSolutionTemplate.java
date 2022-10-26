package task2.solution5;

import java.util.Arrays;

public abstract class AbstractSolutionTemplate {
    public void run(int... nums) {
        boolean result = isAscOrder(nums);
        System.out.println(result);
        System.out.println();
    }

    protected abstract boolean isAscOrder(int[] arr);
}
