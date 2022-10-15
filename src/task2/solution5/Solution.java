package task2.solution5;

// ДОРЕШИТЬ

/**
 * name: Are the numbers in order?
 * ref: https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected boolean isAscOrder(int[] arr) {
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
