package task2.solution3;

public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected int solution(int start, int finish) {
        // сразу идет присваивание и изменение переменной finish
        return (finish -= start) / 3 + finish % 3;
    }
}
