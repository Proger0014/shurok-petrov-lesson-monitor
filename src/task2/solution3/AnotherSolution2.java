package task2.solution3;

public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected int solution(int start, int finish) {
        return finish - start < 3 ? finish - start : solution(start, finish - 3) + 1;
    }
}
