//2024.10.14
//Find numbers which are divisible by given number
//Description:
//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
//
//Example(Input1, Input2 --> Output)
//[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id55edaba99da3a9c84000003b {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(x -> x % divider == 0).toArray();
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[] {2,4,6}, divisibleBy(new int[] {1,2,3,4,5,6},2));
        assertArrayEquals(new int[] {3,6}, divisibleBy(new int[] {1,2,3,4,5,6},3));
        assertArrayEquals(new int[] {0,4}, divisibleBy(new int[] {0,1,2,3,4,5,6},4));
    }
}
