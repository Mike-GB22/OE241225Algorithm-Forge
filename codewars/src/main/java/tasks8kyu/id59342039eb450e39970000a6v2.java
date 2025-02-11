// 2025.02.12
// Count Odd Numbers below
// Given a number n, return the number of positive odd numbers below n, EASY!
//
// Examples (Input -> Output)
// 7  -> 3 (because odd numbers below 7 are [1, 3, 5])
// 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
// Expect large Inputs!
package tasks8kyu;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id59342039eb450e39970000a6v2 {
    public static int oddCount(int n){
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        System.out.println("n = Integer.MAX_VALUE = " + n);
        timerForVariant("IntStream() ->", () -> id59342039eb450e39970000a6.oddCount(n));
        timerForVariant("for ->", () -> oddCount(n));
        tests();
    }

    private static void tests() {
        assertEquals(7, oddCount(15), "For n = 7");
        assertEquals(7511, oddCount(15023), "For n = 15023");
        assertEquals(0, oddCount(-15023), "For n = 0");
        assertEquals(1073741823, oddCount(Integer.MAX_VALUE), "For n = 1073741823");
    }

    private static void timerForVariant(String name, Supplier<Integer> variant) {
        System.out.printf("Variant : %s ", name);
        long timerStart = System.currentTimeMillis();
        int count = variant.get();
        long timerEnd = System.currentTimeMillis();
        System.out.printf("count is : %d, was counted in %d milliseconds.%n", count, timerEnd - timerStart);
    }
}
