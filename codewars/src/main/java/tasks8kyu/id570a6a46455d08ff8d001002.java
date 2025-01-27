//20250128
//No zeros for heros
//Numbers ending with zeros are boring.
//They might be fun in your world, but not here.
//
//Get rid of them. Only the ending ones.
//1450 -> 145
//960000 -> 96
//1050 -> 105
//-1050 -> -105
//Zero alone is fine, don't worry about it. Poor guy anyway
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id570a6a46455d08ff8d001002 {
    public static int noBoringZeros(int n) {
        if (n != 0) {
            while (n % 10 == 0) {
                n /= 10;
            }
        }
        return n;
    }

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(noBoringZeros(1450), 145);
        testing(noBoringZeros(960000), 96);
        testing(noBoringZeros(1050), 105);
        testing(noBoringZeros(-1050), -105);
    }
}
