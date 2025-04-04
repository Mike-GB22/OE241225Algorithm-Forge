//2024.10.07
//Odder Than the Rest
//Create a method that takes an array/list as an input, and outputs the index at which the sole odd number is located.
//
//        This method should work with arrays with negative numbers. If there are no odd numbers in the array, then the method should output -1.
//
//        Examples:
//
//        oddOne([2,4,6,7,10]) # => 3
//        oddOne([2,16,98,10,13,78]) # => 4
//        oddOne([4,-8,98,-12,-7,90,100]) # => 4
//        oddOne([2,4,6,8]) # => -1
package tasks7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5983cba828b2f1fd55000114v2 {

    public static int oddOne(int[] arr){
        //put your lovely code here ^_^
        return IntStream.range(0, arr.length).filter(x -> arr[x] % 2 != 0).findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        assertEquals( 3,  oddOne(new int[]{2,4,6,7,10})           , "Expected  3 in {2, 4, 6,[ 7], 10}");
        assertEquals( 4,  oddOne(new int[]{2,16,98,10,13,78})     , "Expected  4 in {2, 16, 98, 10,[ 13], 78}");
        assertEquals( 4,  oddOne(new int[]{4,-8,98,-12,-7,90,100}), "Expected  4 in {4, -8, 98, -12,[ -7], 90, 100}");
        assertEquals(-1,  oddOne(new int[]{2,4,6,8})              , "Expected -1 in {2, 4, 6, 8}");
    }
}
