package task1;

import java.util.Arrays;

/**
 * 1 решение задачи получения массива, через рекурсию
 */
public class SolutionRecursion1 {
    public void run(int start, int end) {
        int length = getArrayLength(start, end, start, 0);
        int[] array = getArray(length, start, 0, new int[length]);

        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    private int getArrayLength(int start, int end, int currentValue, int currentLength) {

        if (currentValue > end) {
            return currentLength;
        }

        if (start % 2 != 0) {
            start++;
            currentValue++;
        }

        if (end % 2 != 0) {
            end--;
        }

        currentValue += 2;
        currentLength++;

        return getArrayLength(start, end, currentValue, currentLength);
    }


    private int[] getArray(int length, int currentValue, int currentIndex, int[] currentArray) {

        if (currentIndex > length - 1) {
            return currentArray;
        }

        if (currentValue % 2 != 0) {
            currentValue++;
        }

        currentArray[currentIndex] = currentValue;
        currentValue += 2;
        currentIndex++;

        return getArray(length, currentValue, currentIndex, currentArray);
    }
}
