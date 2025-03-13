// 2025.03.13
// Draw stairs
// Given a number n, draw stairs using the letter "I", n tall and n wide, with the tallest in the top left.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5b4e779c578c6a898e0005c5 {
    private static final String STAIR = "I";
    private static final String SPACE = " ";
    private static final String PATTERN = "%s%s%n";
    public static String draw(int n){
        StringBuilder totalSpace = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(String.format(PATTERN, totalSpace.toString(), STAIR));
            totalSpace.append(SPACE);
        }

        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(draw(5));
        test();
    }

    public static void test() {
        assertEquals("""
I
 I
  I""", draw(3), "Stairs.draw(3)");
    }
}
