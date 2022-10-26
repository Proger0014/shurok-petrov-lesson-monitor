package task3.solution1;

import java.util.ArrayList;

/**
 * name: Break camelCase
 * ref: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected String camelCase(String input) {
        char currentChar;
        char currentCharUpper;

        ArrayList<Integer> indexBreak = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            currentCharUpper = String.valueOf(currentChar).toUpperCase().charAt(0);

            if (currentChar == currentCharUpper && i != 0) {
                indexBreak.add(i);
            }
        }

        if (indexBreak.size() == 0) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        int startPos = 0;

        for (int i = 0; i < indexBreak.size() + 1; i++) {

            if (i >= indexBreak.size()) {
                result.append(input.substring(indexBreak.get(i - 1)));
                break;
            }

            result.append(input.substring(startPos, indexBreak.get(i))).append(" ");

            startPos = indexBreak.get(i);
        }

        return result.toString();
    }
}
