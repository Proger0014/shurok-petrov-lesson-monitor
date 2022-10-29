package task1.solution3;

public abstract class AbstractSolutionTemplate {
    public void run(int n) {
        String result = solution(n);
        System.out.println(result);
        System.out.println();
    }

    protected abstract String solution(int n);
}
