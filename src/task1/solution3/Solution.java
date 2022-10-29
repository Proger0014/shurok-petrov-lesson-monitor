package task1.solution3;

import java.util.*;

/**
 * name: Roman Numerals Encoder
 * ref: https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    private static List<RomanNum> romanNumCharacters;
    private static StringBuilder resultRomanNum;

    private static final int COUNT_DIGITS = 3;
    private static final int INCREMENT_DIGITS = 2;

    private static RomanNum minimal;
    private static RomanNum middle;
    private static RomanNum maximal;

    @Override
    protected String solution(int n) {
        init();

        List<Integer> numToRoman = divideToDigit(n);

        for (int num : numToRoman) {
            defineDigits(num);
            addRomanNumByNum(num);
        }

        return resultRomanNum.toString();
    }

    private static void init() {
        initRomanNumCharacters();
        resultRomanNum = new StringBuilder();
    }

    private static void addRomanNumByNum(int num) {

        boolean defaultAppend = true;
        boolean isBiggerMid = num > middle.getNum();

        maximal.setCount(num / maximal.getNum());
        num -= maximal.getNum() * maximal.getCount();
        middle.setCount(num  / middle.getNum());
        num -= middle.getNum() * middle.getCount();
        minimal.setCount(num / minimal.getNum());
        num -= minimal.getNum() * minimal.getCount();

        if (minimal.getCount() > COUNT_DIGITS && !isBiggerMid) {
            middle.setCount(1);
            minimal.setCount(middle.getNum() / minimal.getNum() - minimal.getCount());
            defaultAppend = false;
        } else if (minimal.getCount() > COUNT_DIGITS && isBiggerMid) {
            int buf = middle.getCount();
            middle.setCount(maximal.getCount());
            maximal.setCount(buf);
            minimal.setCount(middle.getNum() / minimal.getNum() - minimal.getCount());
            defaultAppend = false;
        }

        String minimalNumResult = String.valueOf(minimal.getRomanNum()).repeat(Math.max(0, minimal.getCount()));
        String middleNumResult = String.valueOf(middle.getRomanNum()).repeat(Math.max(0, middle.getCount()));
        String maximalNumResult = String.valueOf(maximal.getRomanNum()).repeat(Math.max(0, maximal.getCount()));

        if (defaultAppend) {
            resultRomanNum.append(maximalNumResult);
            resultRomanNum.append(middleNumResult);
            resultRomanNum.append(minimalNumResult);
        } else {
            resultRomanNum.append(minimalNumResult);
            resultRomanNum.append(middleNumResult);
            resultRomanNum.append(maximalNumResult);
        }
    }

    private static void defineDigits(int target) {
        for (int i = 0; i < romanNumCharacters.size() - INCREMENT_DIGITS; i += INCREMENT_DIGITS) {

            RomanNum targetMinimal = romanNumCharacters.get(i);
            RomanNum targetMiddle = romanNumCharacters.get(i + 1);
            RomanNum targetMaximal = romanNumCharacters.get(i + 2);

            if ((target >= targetMinimal.getNum() && target <= targetMaximal.getNum()) ||
                (target >= targetMinimal.getNum() && target >= targetMaximal.getNum() && i == romanNumCharacters.size() - INCREMENT_DIGITS - 1)) {
                minimal = targetMinimal;
                middle = targetMiddle;
                maximal = targetMaximal;
                break;
            }
        }
    }

    private static List<Integer> divideToDigit(int num) {
        List<Integer> digits = new ArrayList<>();

        int digit;
        final int divider_num = 10;
        int divider = 10;

        while (num > 0) {
            digit = num % divider;
            num /= divider;
            num *= divider;

            digits.add(digit);

            divider *= divider_num;
        }

        Collections.reverse(digits);

        return digits;
    }

    private static void initRomanNumCharacters() {
        romanNumCharacters = new ArrayList<>();

        romanNumCharacters.add(new RomanNum("I", 1));
        romanNumCharacters.add(new RomanNum("V", 5));
        romanNumCharacters.add(new RomanNum("X", 10));
        romanNumCharacters.add(new RomanNum("L", 50));
        romanNumCharacters.add(new RomanNum("C", 100));
        romanNumCharacters.add(new RomanNum("D", 500));
        romanNumCharacters.add(new RomanNum("M", 1000));
    }

    static class RomanNum {
        private final String romanNum;
        private final int num;
        private int count;

        public RomanNum(String romanNum, int num) {
            this.romanNum = romanNum;
            this.num = num;
        }

        public String getRomanNum() {
            return romanNum;
        }

        public int getNum() {
            return num;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}
