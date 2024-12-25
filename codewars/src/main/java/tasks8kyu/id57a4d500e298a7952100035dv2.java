//2024.10.21
//Hex to Decimal
//Complete the function which converts hex number (given as a string) to a decimal number.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57a4d500e298a7952100035dv2 {
    public static int hexToDec(final String hexString) {
        //return Integer.parseInt(hexString, 16);
        int result = 0;
        for(Character c : hexString.toLowerCase().toCharArray()){
            result = result * 16 + Integer.parseInt(
                c.toString()
                .replace("a", "10")
                .replace("b", "11")
                .replace("c", "12")
                .replace("d", "13")
                .replace("e", "14")
                .replace("f", "15")
                .replace("-", "0")
            );
        }
        return result * (hexString.charAt(0) == '-' ? -1 : 1);
    }

    public static void main(String[] args) {
        assertEquals(1, hexToDec("1"));
        assertEquals(10, hexToDec("a"));
        assertEquals(16, hexToDec("10"));
        assertEquals(255, hexToDec("FF"));
        assertEquals(-12, hexToDec("-C"));
    }
}
