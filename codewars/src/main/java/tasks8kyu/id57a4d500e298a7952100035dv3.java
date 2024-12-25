//2024.10.21
//Hex to Decimal
//Complete the function which converts hex number (given as a string) to a decimal number.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57a4d500e298a7952100035dv3 {
    public static int hexToDec(final String hexString) {
        //return Integer.parseInt(hexString, 16);
        return (hexString.charAt(0) == '-' ? -1 : 1)
                * hexString.toLowerCase().chars()
                .filter(x -> (x >= '0' && x <= '9') || (x >= 'a' && x <= 'f'))
                .map(x -> x <= '9' ? x - '0' : x - 'a' + 10)
                .reduce(0, (sum, ch) -> sum * 16 + ch);
    }

    public static void main(String[] args) {
        assertEquals(1, hexToDec("1"));
        assertEquals(10, hexToDec("a"));
        assertEquals(16, hexToDec("10"));
        assertEquals(255, hexToDec("FF"));
        assertEquals(-12, hexToDec("-C"));
        assertEquals(-2_147_000_000, hexToDec("-7FF89EC0"));
    }
}
