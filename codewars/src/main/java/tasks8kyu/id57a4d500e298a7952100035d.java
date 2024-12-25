//2024.10.21
//Hex to Decimal
//Complete the function which converts hex number (given as a string) to a decimal number.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.*;

public class id57a4d500e298a7952100035d {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        assertEquals(1, hexToDec("1"));
        assertEquals(10, hexToDec("a"));
        assertEquals(16, hexToDec("10"));
        assertEquals(255, hexToDec("FF"));
        assertEquals(-12, hexToDec("-C"));
    }
}
