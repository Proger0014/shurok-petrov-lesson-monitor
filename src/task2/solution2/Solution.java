package task2.solution2;

import java.util.ArrayList;

/**
 * name: Complementary DNA
 * ref: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
 */
public class Solution extends AbstractSolutionTemplate {

    private static CharPairs charPairs;

    private static void initCharPairs() {
        charPairs = new CharPairs()
                .add('A', 'T')
                .add('C', 'G');
    }

    @Override
    protected String makeComplement(String dna) {
        initCharPairs();

        char[] dnaSequence = dna.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char dnaElement : dnaSequence) {
            CharPairsElement targetChars = charPairs.getPairByChar(dnaElement);

            char alternativeDnaElement = targetChars.getAlternativeChar(dnaElement);
            result.append(alternativeDnaElement);
        }

        return result.toString();
    }

    // статические, потому что иначе будут существовать только в объекте
    static class CharPairs {
        private ArrayList<CharPairsElement> storage;

        public CharPairs() {
            storage = new ArrayList<>();
        }

        public CharPairs add(char first, char second) {
            storage.add(new CharPairsElement(first, second));

            return this;
        }

        public CharPairsElement getPairByChar(char symbol) {
            CharPairsElement result = null;

            for (CharPairsElement pairElement : storage) {
                char symbol1 = pairElement.getElementA();
                char symbol2 = pairElement.getElementB();

                if (symbol1 == symbol || symbol2 == symbol) {
                    result = pairElement;
                    break;
                }
            }

            return result;
        }
    }

    static class CharPairsElement {
        private final char elementA;
        private final char elementB;

        public CharPairsElement(char elementA, char elementB) {
            this.elementA = elementA;
            this.elementB = elementB;
        }

        public char getElementA() {
            return elementA;
        }

        public char getElementB() {
            return elementB;
        }

        public char getAlternativeChar(char target) {
            char result = ' ';

            if (target == getElementA()) {
                result = getElementB();
            } else if (target == getElementB()) {
                result = getElementA();
            }

            return result;
        }
    }
}
