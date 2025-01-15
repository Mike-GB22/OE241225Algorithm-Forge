//2025.01.15
//Implement the function generateRange which takes three arguments (start, stop, step) and returns the range of integers from start to stop (inclusive) in increments of step.
//
//Examples
//(1, 10, 1) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//(-10, 1, 1) -> [-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1]
//(1, 15, 20) -> [1]
//Note
//start < stop
//step > 0
package tasks8kyu;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id55eca815d0d20962e1000106 {
    public static int[] generateRange(int min, int max, int step) {
        return IntStream.rangeClosed(min, max).filter(x -> (x - min) % step == 0).toArray();
    }

    public static void main(String[] args) {
        int[] actual = generateRange(2, 10, 2);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, actual,
                "generateRange(2, 10, 2)\nExpected: [2, 4, 6, 8, 10]\nActual:   " + java.util.Arrays.toString(actual) + "\n");
    }
}
