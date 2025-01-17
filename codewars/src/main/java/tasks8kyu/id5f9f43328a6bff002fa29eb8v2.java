//2025.01.17
//Floating point comparison
//Introduction. floats have limited precision and are unable to exactly represent some values. Rounding errors accumulate with repeated computation, and numbers expected to be equal often differ slightly.
//As a result, it is common advice to not use an exact equality comparison (==) with floats.
//
//>>> a, b, c = 1e-9, 1e-9, 3.33e7
//>>> (a + b) + c == a + (b + c)
//False
//
//>>> 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 == 1.0
//False
//The solution is to check if a computed value is close to an expected value, without requiring them to be exactly equal. It seems very easy, but many katas test float results the wrong way.
//
//Task
//You have:
//a float value that comes from a computation and may have accumulated errors up to ±0.001
//a reference value
//The function is bugged and sometimes returns wrong results.
//
//Your task is to correct the bug.
//Note
//This kata uses fixed tolerance for simplicity reasons, but usually relative tolerance is better. Fixed tolerance is useful for comparisons near zero or when the magnitude of the values is known.

// Option 1: Fails on a=98.7655, b=98.7654999
//         double roundTo3Places = 1000.0;
//         a = Math.round(a * roundTo3Places) / roundTo3Places;
//         b = Math.round(b * roundTo3Places) / roundTo3Places;
//         return a == b;

// Option 2: Fails on a=98.7655, b=98.7654999
//         String a_String = String.format("%.3f", a);
//         String b_String = String.format("%.3f", b);
//         return a_String.equals(b_String);

// Option 3: Fails on a=123.2345, b=123.2345010 and a=98.7655, b=98.7654999 (like the Python version)
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5f9f43328a6bff002fa29eb8v2 {
    private static final double ACCURACY = 0.001;

    public static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) < ACCURACY;
    }
    public static void main(String[] args) {
        Object[][] data = {
                {175.9827, 82.25, false},
                {-156.24037, -156.24038, true},
                {123.2345, 123.234501, true},
                {1456.3652, 1456.3641, false},
                {-1.234, -1.233999, true},
                {98.7655, 98.7654999, true},
                {-7.28495, -7.28596, false}
        };

        for (Object[] testCase : data) {
            double a = (double) testCase[0];
            double b = (double) testCase[1];
            boolean expected = (boolean) testCase[2];
            assertEquals(expected, approxEquals(a, b),
                    String.format("Failed for inputs: a=%.4f, b=%.7f", a, b));
        }
    }
}
