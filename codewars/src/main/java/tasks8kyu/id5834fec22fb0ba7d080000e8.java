// 2025.03.29 BASIC: Making Six Toast.
// You forgot to count the number of toast you put into there, you don't know if you put exactly six pieces of toast into the toasters.
// Define a function that counts how many more (or less) pieces of toast you need in the toasters. Even though you need more or less, the number will still be positive, not negative.
// Examples:
// You must return the number of toast the you need to put in (or to take out). In case of 5 you can still put 1 toast in:
// 5 --> 1
// And in case of 12 you need 6 toasts less (but not -6):
// 12 --> 6

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5834fec22fb0ba7d080000e8 {
    private static final int REQUIRED_QUANTITY = 6;

    public static int sixToast(int num){
        return Math.abs(REQUIRED_QUANTITY - num);
    }

    private static void doTest(int num, int expected) {
        assertEquals(expected, sixToast(num), "Incorrect answer for num = " + num + "\n\n");
    }

    public static void main(String[] args) {
        doTest(15, 9);
        doTest(6, 0);
        doTest(3, 3);
    }
}
