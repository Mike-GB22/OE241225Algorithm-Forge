// 2025.02.17
// Sum of Multiples
// Your Job
// Find the sum of all multiples of n below m
// 
// Keep in Mind
// n and m are natural numbers (positive integers)
// m is excluded from the multiples
// Examples
// sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
// sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
// sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
// sumMul(4, -7)  // throws IllegalArgumentException
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class id57241e0f440cd279b5000829 {
    public static long sumMul(int n, int m) {
        validation(n, m);
        return sumation(n, m);
    }

    private static void validation(int n, int m) {
        if (n < 1 || m < 1 || n > m) {
            throw new IllegalArgumentException();
        }
    }

    private static int sumation(int n, int m) {
        int sum = 0;
        for (int i = n; i < m ; i += n) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        basicTests();
        invalidTests();
    }

    private static void basicTests() {
        assertEquals(20, sumMul(2, 9), "n = 2, m = 9");
        assertEquals(30, sumMul(5, 20), "n = 5, m = 20");
        assertEquals(1860, sumMul(4,123),"n = 4, m = 123");
        assertEquals(86469, sumMul(123,4567),"n = 123, m = 4567");
    }

    private static void invalidTests() {
        assertThrows(IllegalArgumentException.class, () -> sumMul(0, 0), "n = 0, m = 0");
        assertThrows(IllegalArgumentException.class, () -> sumMul(4, -7), "n = 4, m = -7");
        assertThrows(IllegalArgumentException.class, () -> sumMul(-3, 10), "n = -3, m = 10");
    }
}
