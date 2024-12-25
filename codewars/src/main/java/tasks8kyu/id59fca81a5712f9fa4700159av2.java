//2024.10.11
//Convert to Binary
//Task Overview
//        Given a non-negative integer b, write a function which returns an integer d such that the binary representation of b is the same as the decimal representation of d.
//        Examples:
//        1  ->    1  (because  1 is    0b1 in binary)
//        5  ->  101  (because  5 is  0b101 in binary)
//        11 -> 1011  (because 11 is 0b1011 in binary)
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id59fca81a5712f9fa4700159av2 {

    public static int toBinary(int n) {
        String ret = "";
        ret = Integer.toBinaryString(n);
        ret = Integer.toString(n, 2);
        return Integer.parseInt(ret);
    }

    public static void main(String[] args) {
        assertEquals(1, toBinary(1), "Incorrect answer for n = 1");
        assertEquals(10, toBinary(2), "Incorrect answer for n = 2");
        assertEquals(11, toBinary(3), "Incorrect answer for n = 3");
        assertEquals(101, toBinary(5), "Incorrect answer for n = 5");
    }
}
