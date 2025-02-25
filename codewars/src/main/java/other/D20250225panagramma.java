// 2025.02.25
// Проверить что в строке есть все символы английского алфавита, не зависимо от регистра
package other;

import java.util.Locale;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class D20250225panagramma {
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';

    public static boolean checkAllAlphabetThroughFor(String text) {
        text = text.toLowerCase(Locale.ROOT);
        for(char character = LETTER_A; character <= LETTER_Z; character++) {
            if (!text.contains(String.valueOf(character))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAllAlphabetThroughStream(String t) {
        String text = t.toLowerCase(Locale.ROOT);
        long count = IntStream.rangeClosed(LETTER_A, LETTER_Z)
                .filter(ch -> text.contains(String.valueOf((char) ch)))
                .count();
        return count == (LETTER_Z - LETTER_A + 1);
    }

    public static boolean checkAllAlphabetThroughStream2(String t) {
        String text = t.toLowerCase(Locale.ROOT);
        return !IntStream.rangeClosed(LETTER_A, LETTER_Z)
                .anyMatch(ch -> !text.contains(String.valueOf((char) ch)));
    }

    public static void main(String[] args) {
        String strTrue1 = "abcdefghijklmnopqrstuvwxyz";
        String strTrue2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String strTrue3 = "MNOPQRSTUVWXYZABCDEFGHIJKL";
        String strFalse1 = "abcde";
        String strFalse2 = "ABCDEFGHIJKLMNOPQRSTUVWXY";
        assertTrue(checkAllAlphabetThroughFor(strTrue1));
        assertTrue(checkAllAlphabetThroughStream(strTrue1));
        assertTrue(checkAllAlphabetThroughStream2(strTrue1));

        assertTrue(checkAllAlphabetThroughFor(strTrue2));
        assertTrue(checkAllAlphabetThroughStream(strTrue2));
        assertTrue(checkAllAlphabetThroughStream2(strTrue2));

        assertTrue(checkAllAlphabetThroughFor(strTrue3));
        assertTrue(checkAllAlphabetThroughStream(strTrue3));
        assertTrue(checkAllAlphabetThroughStream2(strTrue3));


        assertFalse(checkAllAlphabetThroughFor(strFalse1));
        assertFalse(checkAllAlphabetThroughStream(strFalse1));
        assertFalse(checkAllAlphabetThroughStream2(strFalse1));

        assertFalse(checkAllAlphabetThroughFor(strFalse2));
        assertFalse(checkAllAlphabetThroughStream(strFalse2));
        assertFalse(checkAllAlphabetThroughStream2(strFalse2));
    }

}
