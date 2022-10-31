package task1.solution1;

import java.util.*;

/**
 * не решено
 * name: Another card game
 * ref: https://www.codewars.com/kata/633874ed198a4c00286aa39d/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected boolean game(int[] frank, int[] sam, int[] tom) {
        return frank[2] > Math.max(sam[0], tom[0]) && frank[3] > Math.max(sam[1], tom[1]); // подсказал Igor
    }
}
