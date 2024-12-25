//2024.10.11
//Removing Elements
//Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
//        Example:
//        ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
//        None of the arrays will be empty, so you don't have to worry about that!
package tasks8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id5769b3802ae6f8e4890009d2v3 {
    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.iterate(0, x -> x < arr.length, x -> x += 2)
                .mapToObj(x -> arr[x])
                .toArray();
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
