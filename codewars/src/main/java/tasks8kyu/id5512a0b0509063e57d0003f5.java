// 2025.02.02
// Vasya Pupkin just started learning Java and C#.
// At first, he decided to write simple program that was supposed to sum up two small numbers
// (numbers and their sum fit in a byte), but it didn't work. Vasya was too sad to find out what is wrong.
// Help him to correct the mistake.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5512a0b0509063e57d0003f5 {
    public static int sum(byte a, byte b) {
        return (a + b);
    }

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        assertEquals(3, sum(a, b));
    }
}
