package task2.solution3;

/**
 * ref: https://www.codewars.com/kata/reviews/632e8471ee1c3f00017f6bfe/groups/6349707cc7b35a0001b6c122
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected int solution(int start, int finish) {
        return finish - start < 3 ? finish - start : solution(start, finish - 3) + 1;
    }
}
