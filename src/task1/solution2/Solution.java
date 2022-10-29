package task1.solution2;

/**
 * name: Unusual Lex Order
 * ref: https://www.codewars.com/kata/5a438bc1e1ce0e129100005a/train/java
 */
public class Solution extends AbstractSolutionTemplate {
    @Override
    protected String[] unusualLexOrder(String[] words) {
        boolean isSorted = false;
        String buf; // текущий String

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < words.length - 1; i++) {
                buf = words[i];
                if (currentWordIsBigger(words[i], words[i + 1])){
                    isSorted = false;

                    words[i] = words[i + 1];
                    words[i + 1] = buf;
                }
            }
        }

        return words;
    }

    static boolean charactersCurrentWordIsBigger(String currentWord, String nextWord) {
        boolean isBigger = false;

        char currentCharShortWord;
        char currentCharLongWord;

        int diffLength = 0;

        String shortWord = nextWord;
        String longWord = currentWord;


        if (currentWord.length() > nextWord.length()) {
            diffLength = currentWord.length() - nextWord.length();
        } else {
            diffLength = nextWord.length() - currentWord.length();
        }

        if (nextWord.length() > currentWord.length()) {
            shortWord = currentWord;
            longWord = nextWord;
        }

        for (int i = longWord.length() - 1; i >= diffLength; i--) {
            currentCharShortWord = shortWord.charAt(i - diffLength);
            currentCharLongWord = longWord.charAt(i);
            if (currentCharLongWord == currentCharShortWord) {
                continue;
            }

            isBigger = currentCharShortWord > currentCharLongWord && shortWord.equals(currentWord) ||
                    currentCharLongWord > currentCharShortWord && longWord.equals(currentWord);
            break;
        }

        return isBigger;
    }

    static boolean currentWordIsBigger(String currentWord, String nextWord) {
        return nextWordIsSuffix(currentWord, nextWord) || charactersCurrentWordIsBigger(currentWord, nextWord);
    }

    static boolean nextWordIsSuffix(String currentWord, String nextWord) {
        if (currentWord.length() <= nextWord.length()) {
            return false;
        }

        int lengthCurrentWord = currentWord.length();
        int lengthNextWord = nextWord.length();

        int diffLength = lengthCurrentWord - lengthNextWord;

        String substringFromCurrentWord = currentWord.substring(diffLength);

        return substringFromCurrentWord.equals(nextWord);
    }
}
