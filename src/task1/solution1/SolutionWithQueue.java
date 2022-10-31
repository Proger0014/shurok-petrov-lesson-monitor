package task1.solution1;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionWithQueue extends AbstractSolutionTemplate {
    private final Queue<Integer> expectedCards = new LinkedList<>();

    @Override
    protected boolean game(int[] frank, int[] sam, int[] tom) {
        init(frank, sam, tom);

        boolean frankIsBigger = true;
        while (!expectedCards.isEmpty()) {
            int frankCard = expectedCards.poll();
            int samCard = expectedCards.poll();
            int tomCard = expectedCards.poll();

            frankIsBigger = frankIsBigger && (frankCard > Math.max(samCard, tomCard));
        }

        return frankIsBigger;
    }

    private void init(int[] frank, int[] sam, int[] tom) {
        expectedCards.add(frank[2]);
        expectedCards.add(sam[0]);
        expectedCards.add(tom[0]);
        expectedCards.add(frank[3]);
        expectedCards.add(sam[1]);
        expectedCards.add(tom[1]);
    }
}
