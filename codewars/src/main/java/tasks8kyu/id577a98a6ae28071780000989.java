//2024.10.11
//Find Maximum and Minimum Values of a List
//Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.
//        Examples (Input -> Output)
//        * [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
//        * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
//        * [42, 54, 65, 87, 0]             -> min = 0, max = 87
//        * [5]                             -> min = 5, max = 5
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id577a98a6ae28071780000989 {
    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static void main(String[] args) {
        assertEquals(-110, min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, max(new int[]{5}));
    }
}
