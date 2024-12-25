//2024.10.11
//Removing Elements
//Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
//        Example:
//        ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
//        None of the arrays will be empty, so you don't have to worry about that!
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id5769b3802ae6f8e4890009d2 {
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] retArr = new Object[(arr.length + 1)/ 2];
        for(int i = 0; i < retArr.length; i++){
            retArr[i] = arr[i * 2];
        }
        return retArr;
    }

    private static void doTest(Object[] input, Object[] expected) {
        String message = "for array: " + Arrays.toString(input) + "\n";
        Object[] actual = removeEveryOther(input);
        assertArrayEquals(expected, actual, message);
    }


    public static void main(String[] art){
        doTest(new Object[] { "Hello", "Goodbye", "Hello Again" }, new Object[] { "Hello", "Hello Again" });
        doTest(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new Object[] { 1, 3, 5, 7, 9 });
        doTest(new Object[] { new Object[] { 1, 2 } }, new Object[] { new Object[] { 1, 2 } });
        doTest(new Object[] { "Goodbye" }, new Object[] { "Goodbye" });
    }
}
