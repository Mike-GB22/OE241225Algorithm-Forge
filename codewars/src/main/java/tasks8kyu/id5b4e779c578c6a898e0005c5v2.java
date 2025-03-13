// 2025.03.13
// Draw stairs
// Given a number n, draw stairs using the letter "I", n tall and n wide, with the tallest in the top left.
package tasks8kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5b4e779c578c6a898e0005c5v2 {
    private static final String STAIR = "I";
    private static final String SPACE = " ";
    public static String draw(int n){
        return IntStream.range(0, n)
                .mapToObj(i -> SPACE.repeat(i).concat(STAIR))
                .collect(Collectors.joining("\n"));
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
