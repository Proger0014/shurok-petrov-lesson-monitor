package task3.solution2;

/**
 * ref: https://www.codewars.com/kata/reviews/54da5d0598b8a2ad76000246/groups/54da5d0598b8a2ad76000248
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected int findIt(int[] a) {
        // если сравниваются два одинаковых числа, то результат false
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i]; // ??????
        }

        return xor;
    }
}
