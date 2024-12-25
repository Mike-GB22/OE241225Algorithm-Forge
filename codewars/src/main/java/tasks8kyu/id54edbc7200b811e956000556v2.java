//2024.10.09
//Counting sheep...
//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
//
//        For example,
//
//        [true,  true,  true,  false,
//        true,  true,  true,  true ,
//        true,  false, true,  false,
//        true,  false, false, true ,
//        true,  true,  true,  true ,
//        false, false, true,  true]
//        The correct answer would be 17.
//
//        Hint: Don't forget to check for bad values like null/undefined
package tasks8kyu;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id54edbc7200b811e956000556v2 {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(x -> Objects.equals(x, true)).count();
    }

    public static void main(String[] args) {
        doTest(new Boolean[] {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true
        }, 17);
        doTest(new Boolean[] { false, true, true }, 2);
        doTest(new Boolean[] {}, 0);
        doTest(new Boolean[] { false, null, true, false, null, null, true}, 2);
        doTest(new Boolean[] { false, null, null}, 0);
    }

    private static void doTest(Boolean[] input, int expected) {
        String message = String.format("for array: %s\n", Arrays.toString(input));
        int actual = countSheeps(input);
        assertEquals(expected, actual, message);
    }
}
