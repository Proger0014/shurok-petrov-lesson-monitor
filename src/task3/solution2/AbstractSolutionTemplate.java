package task3.solution2;

public abstract class AbstractSolutionTemplate {
    public void run(int[] a) {
        int result = findIt(a);
        System.out.println(result);
        System.out.println();
    }

    protected abstract int findIt(int[] a);
}
