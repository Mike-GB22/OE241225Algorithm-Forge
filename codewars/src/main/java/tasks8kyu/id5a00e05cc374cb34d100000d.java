//2024.10.12
//Reversed sequence
//Description:
//Build a function that returns an array of integers from n to 1 where n>0.
//
//Example : n=5 --> [5,4,3,2,1]
package tasks8kyu;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id5a00e05cc374cb34d100000d {

    public static int[] reverse(int n){
        return IntStream.iterate(n, a -> a > 0, a -> a = a -1).toArray();
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[]{5,4,3,2,1}, reverse(5));
        assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, reverse(10));
    }
}
