//2024.10.12
//Sum without highest and lowest number
//Description:
//Task
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//
//Mind the input validation.
//
//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
//Input validation
//If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
package tasks8kyu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id576b93db1129fcf2200001e6v2 {

    public static int sum(int[] numbers){
        return numbers == null || numbers.length < 2? 0
                : Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .limit(numbers.length - 2)
                .sum();
    }

    public static void main(String[] args) {
        assertEquals(16, sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(16, sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(6, sum(new int[] { 1, 1, 11, 2, 3}));
    }

}
