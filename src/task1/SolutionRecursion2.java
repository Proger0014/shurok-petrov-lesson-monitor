package task1;

import java.util.Arrays;

public class SolutionRecursion2 {
    private final int START;
    private final int END;

    public SolutionRecursion2(int start, int end) {
        START = fixStartValue(start);
        END = fixEndValue(end);
    }

    private int currentLength;
    private int[] currentArray;

    public void run() {
        findLength(START);
        currentArray = new int[currentLength];
        findArray(0, START);

        System.out.println(Arrays.toString(currentArray));
        System.out.println();
    }

    private void findLength(int currentValue) {

        if (currentValue > END) {
            return;
        }

        if (currentValue % 2 == 0) {
            currentLength += 1;
        }

        findLength(currentValue + 2);
    }


    private void findArray(int currentIndex, int currentValue) {

        if (currentIndex > currentLength - 1) {
            return;
        }

        currentArray[currentIndex] = currentValue;

        findArray(currentIndex + 1, currentValue + 2);
    }

    private int fixStartValue(int start) {
        int result = start;

        if (start % 2 != 0) {
            result = start + 1;
        }

        return result;
    }

    private int fixEndValue(int end) {
        int result = end;

        if (end % 2 != 0) {
            result = end - 1;
        }

        return result;
    }
}
