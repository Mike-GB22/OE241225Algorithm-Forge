//2024.10.14
//Array plus array
//Description:
//I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.
//P.S. Each array includes only integer numbers. Output is a number too.


package tasks8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5a2be17aee1aaefe2a000151 {
    public static void main(String[] args) {
        assertEquals(21, arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    private static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sum();
    }

}
