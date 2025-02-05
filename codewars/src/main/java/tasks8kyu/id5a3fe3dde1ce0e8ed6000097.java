// 2025.02.05
// Century From Year
// Introduction
// The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
//
// Task
// Given a year, return the century it is in.
//
// Examples
// 1705 --> 18
// 1900 --> 19
// 1601 --> 17
// 2000 --> 20
// 2742 --> 28
//Note: this kata uses strict construction as shown in the description and the examples, you can read more about it here

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5a3fe3dde1ce0e8ed6000097 {
    public static int century(int number) {
        return 1 + (number - 1) / 100;
    }

    public static void main(String[] args) {
        assertEquals(18, century(1705));
        assertEquals(19, century(1900));
        assertEquals(17, century(1601));
        assertEquals(20, century(2000));
        assertEquals(1,  century(89));
    }

}
