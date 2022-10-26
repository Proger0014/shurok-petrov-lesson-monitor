package task1;

import java.util.LinkedList;
import java.util.List;

public class SolutionLinkedList {
    public void run(int start, int end) {
        int fixedStart = fixStartValue(start);
        int fixedEnd = fixEndValue(end);

        System.out.println(getList(fixedStart, fixedEnd));
        System.out.println();
    }

    private List<Integer> getList(int start, int end) {
        List<Integer> listNums = new LinkedList<>();

        for (int value = start; value <= end; value += 2) {
            listNums.add(value);
        }

        return listNums;
    }

    private int fixStartValue(int start) {
        return start % 2 == 0 ? start : start + 1;
    }

    private int fixEndValue(int end) {
        return end % 2 == 0 ? end : end - 1;
    }
}
