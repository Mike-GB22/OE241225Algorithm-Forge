// 2025.02.10
// Enumerable Magic #1 - True for All?
// Create a method all which takes two params:
// a sequence
// a function (function pointer in C)
// and returns true if the function in the params returns true for every element in the sequence. Otherwise, it should return false. If the sequence is empty, it should return true, since technically nothing failed the test.
// Example
// all((1, 2, 3, 4, 5), greater_than_9) -> false
// all((1, 2, 3, 4, 5), less_than_9)    -> True
package tasks8kyu;

import java.util.Arrays;
import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id54598d1fcbae2ae05200112c {
    public static boolean all(int[] list, IntPredicate predicate){
        return list.length == Arrays.stream(list).filter(predicate).count();
    }

    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;

    public static void main(String[] args) {
        assertTrue(all(new int[]{2, 4, 6, 10}, evenNumber));
        assertFalse(all(new int[]{1, 3, 5, 10}, oddNumber));
        assertFalse(all(new int[]{2, 4, 6, 19}, lessThan10));
        assertTrue(all(new int[]{1, 1, 2}, lessThan5));
        assertTrue(all(new int[]{2, 9, 4, 3}, greaterThan1));
        assertFalse(all(new int[]{2, 9, 4, 0}, greaterThan1));
        assertFalse(all(new int[]{5, 6, 7, 8}, greaterThan5));
        assertTrue(all(new int[]{13, 42}, greaterThan10));

        assertFalse(all(new int[]{5}, evenNumber));
        assertTrue(all(new int[]{5}, oddNumber));
        assertFalse(all(new int[]{5}, lessThan5));

        assertTrue(all(new int[]{}, evenNumber));
        assertTrue(all(new int[]{}, lessThan5));
        assertTrue(all(new int[]{}, greaterThan10));
    }
}
