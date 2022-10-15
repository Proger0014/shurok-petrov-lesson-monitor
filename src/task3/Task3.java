package task3;

/**
 * 2 tasks 6 kyu
 */
public class Task3 {
    public static void main(String[] args) {
        runSolution1();
    }

    private static void runSolution1() {
        System.out.println("== Solution 1 ==");

        String input = "CamelCasingASdAbobus";

        new task3.solution1.Solution().run(input);
        new task3.solution1.AnotherSolution1().run(input);
        new task3.solution1.AnotherSolution2().run(input);
    }

    private static void runSolution2() {

    }
}
