package task2.solution3;

/**
 * ref: https://www.codewars.com/kata/reviews/632e8471ee1c3f00017f6bfe/groups/633cec7aa69a64000163be8f
 */
public class AnotherSolution1 extends AbstractSolutionTemplate {
    @Override
    protected int solution(int start, int finish) {
        // сразу идет присваивание и изменение переменной finish
        return (finish -= start) / 3 + finish % 3;
    }
}
