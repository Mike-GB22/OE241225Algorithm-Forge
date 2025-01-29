//2025.01.29
//Exclamation marks series #4: Remove all exclamation marks from sentence but ensure a exclamation mark at the end of string
//Remove all exclamation marks from sentence but ensure a exclamation mark at the end of string.
// For a beginner kata, you can assume that the input data is always a non empty string, no need to verify it.

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57faf12b21c84b5ba30001b0 {
    static String remove(String s) {
        return s.replaceAll("!", "").concat("!");
    }

    public static void main(String[] args) {
        assertEquals("Hi!", remove("Hi!"), "For input \"Hi!\"");
        assertEquals("Hi!", remove("Hi!!!"), "For input \"Hi!!!\"");
        assertEquals("Hi!", remove("!Hi"), "For input \"!Hi\"");
        assertEquals("Hi!", remove("!Hi!"), "For input \"!Hi!\"");
        assertEquals("Hi Hi!", remove("Hi! Hi!"), "For input \"Hi! Hi!\"");
        assertEquals("Hi!", remove("Hi"), "For input \"Hi\"");
    }
}
