// 2025.03.28 Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence
// Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

package tasks8kyu;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57fb09ef2b5314a8a90001edV2 {
    private static final Set<Character> WHAT = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    private static final String FOR_WHAT = "!";

    public static String replace(final String s) {
        StringBuilder result = new StringBuilder();
        for (char symbol : s.toCharArray()) {
            if (WHAT.contains(symbol)) {
                result.append(FOR_WHAT);
            } else {
                result.append(symbol);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        assertEquals("H!!", replace("Hi!"));
        assertEquals("!H!! H!!", replace("!Hi! Hi!"));
        assertEquals("!!!!!", replace("aeiou"));
        assertEquals("!BCD!", replace("ABCDE"));
    }
}
