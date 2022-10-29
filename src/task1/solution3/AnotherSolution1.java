package task1.solution3;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class AnotherSolution1 extends AbstractSolutionTemplate {

    private static TreeMap<Integer, String> MAP;
    static {
        MAP = new TreeMap<>(Collections.reverseOrder());
        MAP.put(1, "I");
        MAP.put(4, "IV");
        MAP.put(5, "V");
        MAP.put(9, "IX");
        MAP.put(10, "X");
        MAP.put(40, "XL");
        MAP.put(50, "L");
        MAP.put(90, "XC");
        MAP.put(100, "C");
        MAP.put(400, "CD");
        MAP.put(500, "D");
        MAP.put(900, "CM");
        MAP.put(1000, "M");
    }

    @Override
    protected String solution(int n) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : MAP.entrySet()) {
            int i = entry.getKey();
            String s = entry.getValue();
            while (n >= i) {
                builder.append(s);
                n -= i;
            }
        }

        return builder.toString();
    }
}
