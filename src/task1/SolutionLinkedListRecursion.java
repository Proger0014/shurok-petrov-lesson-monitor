package task1;

import java.util.LinkedList;

public class SolutionLinkedListRecursion {
    public void run(int start, int end) {
        start = start % 2 == 0 ? start : start + 1;
        end = end % 2 == 0 ? end : end - 1;

        System.out.println(getList(new LinkedList<Integer>(), end, start));
        System.out.println();
    }

    private LinkedList<Integer> getList(LinkedList<Integer> currentList, int end, int currentValue) {
        if (currentValue > end) {
            return currentList;
        }

        currentList.add(currentValue);

        return getList(currentList, end, currentValue + 2);
    }
}
