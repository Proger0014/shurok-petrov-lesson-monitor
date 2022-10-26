package task2.solution4;

public abstract class AbstractSolutionTemplate {
    public void run(int n) {
        long result = numberOfDivisors(n);
        System.out.println(result);
        System.out.println();
    }

    protected   abstract long numberOfDivisors(int n);
}
