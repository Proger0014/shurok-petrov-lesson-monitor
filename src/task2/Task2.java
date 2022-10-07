package task2;

import task2.solution1.AnotherSolution1;
import task2.solution1.AnotherSolution2;
import task2.solution1.AnotherSolution3;
import task2.solution1.Solution;

/**
 * 5 tasks 7 kyu
 */
public class Task2 {
    public static void main(String[] args) {
        runSolution1();
    }

    private static void runSolution1() {
        System.out.println("== Solution 1 ==");

        String[] strs = new String[3];
        strs[0] = "asd";
        strs[1] = "sdsds";
        strs[2] = "";

        new Solution().run(strs);
        new AnotherSolution1().run(strs);
        new AnotherSolution2().run(strs);
        new AnotherSolution3().run(strs);

        System.out.println();
    }
}
