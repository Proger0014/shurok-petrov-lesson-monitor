package task1;

import java.util.Arrays;

public class Solution {
    public void run(int start, int end) {
        start = start % 2 == 0 ? start : start + 1;
        end = end % 2 == 0 ? end : end - 1;

        int length = getArrayLength(start, end);
        int[] result = getArray(start, length);

        System.out.println(Arrays.toString(result));
        System.out.println();
    }

    private int getArrayLength(int start, int end) {
        return (end - start) / 2 + 1;
    }

    private int[] getArray(int start, int length) {
        int[] result = new int[length];
        int value = start;

        for (int i = 0; i < result.length; i++) {
            result[i] = value;
            value += 2;
        }

        return result;
    }
}
