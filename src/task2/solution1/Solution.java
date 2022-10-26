package task2.solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * name: Testing 1-2-3
 * ref: https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();

        int lineNumber = 1;

        for (String line : lines) {
            result.add(String.format("%d: %s", lineNumber, line));
            lineNumber++;
        }

        return  result;
    }
}
