// 2025.02.21
// Find the Integral
// Description:
// Create a function that finds the integral of the expression passed.
// In order to find the integral all you need to do is add one to the exponent (the second argument), and divide the coefficient (the first argument) by that new number.
// For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, and divided the coefficient by that new number).
// Notes:
// The output should be a string.
// The coefficient and exponent is always a positive integer.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id59811fd8a070625d4c000013 {
    private static final String PATTERN = "%dx^%d";
    public static String integrate(int coefficient, int exponent) {
        return String.format(PATTERN, coefficient/++exponent, exponent);
    }

    public static void main(String[] args) {
        assertEquals("1x^3", integrate(3,2));
        assertEquals("2x^6", integrate(12,5));
        assertEquals("10x^2", integrate(20,1));
        assertEquals("10x^4", integrate(40,3));
        assertEquals("30x^3", integrate(90,2));
    }
}
