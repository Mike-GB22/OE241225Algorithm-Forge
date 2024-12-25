//2024.10.09
//Is it even?
//Description:
//        In this Kata we are passing a number (n) into a function.
//        Your code will determine if the number passed is even (or not).
//        The function needs to return either a true or false.
//        Numbers may be positive or negative, integers or floats.
//        Floats with decimal part non equal to zero are considered UNeven for this kata.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id555a67db74814aa4ee0001b5 {

    public static boolean isEven(double n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        assertEquals(true, isEven(0));
        assertEquals(false, isEven(0.5));
        assertEquals(false, isEven(1));
        assertEquals(true, isEven(2));
        assertEquals(true, isEven(-4));
    }
}
