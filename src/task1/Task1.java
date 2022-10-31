package task1;

/**
 * Решение нерешенных codewars задач
 */
public class Task1 {
    public static void main(String[] args) {
        runSolution1();
//        runSolution2();
//        runSolution3();
    }

    private static void runSolution1() {
        System.out.println("== Solution 1 ==");

        int[] frank = new int[] { 1, 2, 3, 4 };
        int[] sam = new int[] { 5, 6, 7, 8 };
        int[] tom = new int[] { 0, 9, 10, 11 };

        new task1.solution1.Solution().run(frank, sam, tom);
        new task1.solution1.SolutionWithQueue().run(frank, sam, tom);
    }

    private static void runSolution2() {
        System.out.println("== Solution 2 ==");

        String[] words = new String[] { "nigeb", "ta", "eht", "gninnigeb" };

        new task1.solution2.Solution().run(words);
        new task1.solution2.AnotherSolution1().run(words);
        new task1.solution2.AnotherSolution2().run(words);
        new task1.solution2.AnotherSolution3().run(words);
    }

    private static void runSolution3() {
        System.out.println("== Solution 3 ==");

        int n = 900;

        new task1.solution3.Solution().run(n);
        new task1.solution3.AnotherSolution1().run(n);
        new task1.solution3.AnotherSolution2().run(n);
        new task1.solution3.AnotherSolution3().run(n);
    }
}
