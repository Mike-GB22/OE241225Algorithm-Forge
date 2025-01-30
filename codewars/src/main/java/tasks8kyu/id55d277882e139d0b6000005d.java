//2025.01.30
//Grasshopper - Array Mean
//Find Mean
//Find the mean (average) of a list of numbers in an array.
//
//Information
//To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.
//
//For an example list of 1, 3, 5, 7
//
//1. Add all of the numbers
//
//1+3+5+7 = 16
//2. Divide by the number of values in the list. In this example there are 4 numbers in the list.
//
//16/4 = 4
//3. The mean (or average) of this list is 4
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55d277882e139d0b6000005d {
    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().getAsDouble();
    }

    public static void main(String[] args) {
        assertEquals(1, findAverage(new int[]{1}));
        assertEquals(4, findAverage(new int[]{1,3,5,7}));
    }
}
