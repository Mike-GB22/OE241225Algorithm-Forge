package tasks8kyu;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id56676e8fabd2d1ff3000000c {
    private static final String MESSAGE = "found the needle at position ";
    private static final String NEEDLE = "needle";

    public static String findNeedle(Object[] haystack) {
        return MESSAGE +
                IntStream.range(0, haystack.length)
                        .filter(x -> NEEDLE.equals(haystack[x]))
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        Object[] haystack4 = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        assertEquals("found the needle at position 3", findNeedle(haystack1));
        assertEquals("found the needle at position 5", findNeedle(haystack2));
        assertEquals("found the needle at position 30", findNeedle(haystack3));
        assertEquals("found the needle at position 5", findNeedle(haystack4));
    }
    
        
}
