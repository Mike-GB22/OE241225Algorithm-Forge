//2025.01.14
//Write a function that removes the spaces from the string, then return the resultant string.
//Examples (Input -> Output):

package tasks8kyu;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57eae20f5500ad98e50002c5 {
    public static String noSpace(final String x) {
        return x.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", noSpace("8j aam"));
    }
}
