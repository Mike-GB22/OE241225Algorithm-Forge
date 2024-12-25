//2024.10.11
//Count of positives / sum of negatives
//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//
//If the input is an empty array or is null, return an empty array.
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id576bb71bbbcf0951d5000044 {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        return (input == null || input.length == 0) ? new int[0]: new int[]{
                (int) Arrays.stream(input).filter(x -> x > 0).count(),
                Arrays.stream(input).filter(x -> x< 0).sum()
        } ;
    }

    public static void main(String[] args) {
        countPositivesSumNegatives_BasicTest();
        countPositivesSumNegatives_InputWithZeroes();
    }
    public static void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
    public static void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
