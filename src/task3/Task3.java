package task3;

/**
 * 2 tasks 6 kyu
 */
public class Task3 {
    public static void main(String[] args) {
        runSolution1();
        runSolution2();
    }

    private static void runSolution1() {
        System.out.println("== Solution 1 ==");

        String input = "CamelCasingASdAbobus";

        new task3.solution1.Solution().run(input);
        new task3.solution1.AnotherSolution1().run(input);
        new task3.solution1.AnotherSolution2().run(input);
    }

    private static void runSolution2() {
        System.out.println("== Solution 2 ==");

        int[] a = new int[] {1,1,2,-2,5,2,4,4,-1,-2,5};

        new task3.solution2.Solution().run(a);
        new task3.solution2.AnotherSolution1().run(a);
        new task3.solution2.AnotherSolution2().run(a);
    }
}
