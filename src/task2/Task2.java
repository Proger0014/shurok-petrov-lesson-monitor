package task2;

// продолжить https://www.codewars.com/kata/554e4a2f232cdd87d9000038/solutions/java

/**
 * 5 tasks 7 kyu
 */
public class Task2 {
    public static void main(String[] args) {
        runSolution1();
        runSolution2();
        runSolution3();
        runSolution4();
        runSolution5();
    }

    private static void runSolution1() {
        System.out.println("== Solution 1 ==");

        String[] strs = new String[3];
        strs[0] = "asd";
        strs[1] = "sdsds";
        strs[2] = "";

        new task2.solution1.Solution().run(strs);
        new task2.solution1.AnotherSolution1().run(strs);
        new task2.solution1.AnotherSolution2().run(strs);
        new task2.solution1.AnotherSolution3().run(strs);

        System.out.println();
    }

    private static void runSolution2() {
        System.out.println("== Solution 2 ==");

        String dna = "ATCG";

        new task2.solution2.Solution().run(dna);
        new task2.solution2.AnotherSolution1().run(dna);
        new task2.solution2.AnotherSolution2().run(dna);
    }

    private static void runSolution3() {
        System.out.println("== Solution 3 ==");

        int start = 1;
        int finish = 5;

        new task2.solution3.Solution().run(start, finish);
        new task2.solution3.AnotherSolution1().run(start, finish);
        new task2.solution3.AnotherSolution2().run(start, finish);
    }

    private static void runSolution4() {
        System.out.println("== Solution 4 ==");

        int n = 12;

        new task2.solution4.Solution().run(n);
        new task2.solution4.AnotherSolution1().run(n);
        new task2.solution4.AnotherSolution2().run(n);
    }

    private static void runSolution5() {
        System.out.println("== Solution 5 ==");

        int[] nums = new int[] { 56, 98, 123, 67, 742, 1024, 32, 90969 };

        new task2.solution5.Solution().run(nums);
        new task2.solution5.AnotherSolution1().run(nums);
        new task2.solution5.AnotherSolution2().run(nums);
    }
}
