// 2025.03.28 Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence
// Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

package tasks8kyu;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57fb09ef2b5314a8a90001edV3 {
    private static final String WHAT = "AEIOUaeiou";
    private static final String FOR_WHAT = "!";

    public static String replace(final String s) {
        return s.replaceAll("[" + WHAT + "]", FOR_WHAT);
    }

    public static void main(String[] args) {
        assertEquals("H!!", replace("Hi!"));
        assertEquals("!H!! H!!", replace("!Hi! Hi!"));
        assertEquals("!!!!!", replace("aeiou"));
        assertEquals("!BCD!", replace("ABCDE"));
    }
}
