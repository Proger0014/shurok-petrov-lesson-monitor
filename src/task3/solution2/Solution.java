package task3.solution2;

/**
 * name: Find the odd int
 * ref: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected int findIt(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 1;


            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                result = a[i];
                break;
            }
        }

        return result;
    }
}
