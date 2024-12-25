//2024.10.30
//Multiply the number
//Description:
//Jack really likes his number five: the trick here is that you have to multiply each number by
// 5 raised to the number of digits of each numbers, so, for example:
//
//3 -->    15  (  3 * 5?)
//10 -->   250  ( 10 * 5?)
//200 --> 25000  (200 * 5?)
//0 -->     0  (  0 * 5?)
//-3 -->   -15  ( -3 * 5?)
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5708f682c69b48047b000e07 {
    public static int multiply(int number) {
        return (int) (number * Math.pow(5, String.valueOf(Math.abs(number)).length()));
    }

    public static void main(String[] args) {
        assertEquals(15, multiply(3), "For number = 3");
        assertEquals(250, multiply(10), "For number = 10");
        assertEquals(25000, multiply(200), "For number = 200");
        assertEquals(0, multiply(0), "For number = 0");
        assertEquals(-15, multiply(-3), "For number = -3");
    }
}
