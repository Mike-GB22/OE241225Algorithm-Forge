// 2025.02.19
// MakeUpperCase
// Write a function which converts the input string to uppercase.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57a0556c7cb1f31ab3000ad7 {
    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        assertEquals(makeUpperCase("hello"), "HELLO");
        assertEquals(makeUpperCase("hello world"), "HELLO WORLD");
        assertEquals(makeUpperCase("hello world !"), "HELLO WORLD !");
        assertEquals(makeUpperCase("heLlO wORLd !"), "HELLO WORLD !");
        assertEquals(makeUpperCase("1,2,3 hello world!"), "1,2,3 HELLO WORLD!");        
    }
}
