package task1;

/**
 * Решение задачи нахождения массива четных чисел от
 * начального и до конечного значения разными способами
 */
public class Task1 {
    public static void main(String[] args) {
        int start = -3;
        int end = 2;

        new SolutionRecursion1().run(start, end);
        new SolutionRecursion2(start, end).run();
        new SolutionLinkedList().run(start, end);
        new SolutionLinkedListRecursion().run(start, end);
        new Solution().run(start, end);
    }
}
