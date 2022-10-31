package task1.solution3;

public class AnotherSolution2 extends AbstractSolutionTemplate {
    final String[] digit = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
    final String[] ten = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    final String[] hundred = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    final String[] thousand = { "", "M", "MM", "MMM" };

    @Override
    protected String solution(int n) {
        String result = "";

        result = thousand[n / 1000] + hundred[n % 1000 / 100] + ten[n % 100 / 10] + digit[n % 10]; // непонятки с остатком от деления [разобрался]

        return result;
    }
}
