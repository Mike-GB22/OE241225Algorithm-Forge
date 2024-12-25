//2024.10.11
//Square(n) Sum
//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//For example, for [1, 2, 2] it should return 9 because
//1^2+2^2+2^2=9
package tasks8kyu;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id515e271a311df0350d00000f {

    public static int squareSum(int[] n){
        return Arrays.stream(n).reduce(0, (a ,b) -> a + b * b);
    }

    public static void main(String[] args) {
        assertEquals(9, squareSum(new int[] {1,2,2}));
        assertEquals(5, squareSum(new int[] {1,2}));
        assertEquals(50, squareSum(new int[] {5,-3,4}));
        assertEquals(0, squareSum(new int[] {}));
    }
}
