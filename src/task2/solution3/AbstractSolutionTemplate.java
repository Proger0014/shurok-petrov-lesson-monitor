package task2.solution3;

public abstract class AbstractSolutionTemplate {
    public void run(int start, int finish) {
        int minimalJumps = solution(start, finish);
        System.out.println(minimalJumps);
        System.out.println();
    }

    protected abstract int solution(int start, int finish);
}
