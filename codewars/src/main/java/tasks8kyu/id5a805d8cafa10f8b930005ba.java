//2024.10.14
//Find Nearest square number
//Description:
//Your task is to find the nearest square number of a positive integer n.
// In mathematics, a square number or perfect square is an integer that is the square of an integer;
// in other words, it is the product of some integer with itself.
//
// For example, if n = 111, then the nearest square number equals 121, since 111 is closer to 121,
// the square of 11, than 100, the square of 10.
//If n is already a perfect square (e.g. n = 144, n = 81, etc.), you need to just return n.
//Good luck :)

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5a805d8cafa10f8b930005ba {
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }

    public static void main(String[] args) {
        assertEquals(1, nearestSq(1));
        assertEquals(1, nearestSq(2));
        assertEquals(9, nearestSq(10));
        assertEquals(121, nearestSq(111));
        assertEquals(10000, nearestSq(9999));
    }
}