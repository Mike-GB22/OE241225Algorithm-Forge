// 2025.02.07
// Regexp Basics - is it a digit?
// Implement String#digit? (in Java isDigit(String)),
// which should return true if given object is a digit (0-9), false otherwise.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id567bf4f7ee34510f69000032v2 {
    private static final String PATTERN = "[0-9]";
    public static boolean isDigit(String s) {
        return s.matches(PATTERN);
    }

    public static void main(String[] args) {
        assertFalse(isDigit(""));
        assertTrue(isDigit("7"));
        assertFalse(isDigit(" "));
        assertFalse(isDigit("a"));
        assertFalse(isDigit("a5"));
        assertFalse(isDigit("14"));
    }
}
