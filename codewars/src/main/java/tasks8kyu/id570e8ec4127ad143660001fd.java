//2025.01.17
//Name on billboard Description:
//You can print your name on a billboard ad. Find out how much it will cost you. Each character has a default price of ?30, but that can be different if you are given 2 parameters instead of 1 (always 2 for Java).
//You can not use multiplier "*" operator.
//If your name would be Jeong-Ho Aristotelis, ad would cost ?600. 20 letters * 30 = 600 (Space counts as a character).
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id570e8ec4127ad143660001fd {
    public static int billboard(String name, int price) {
        return Math.multiplyExact(price, name.length());
    }

    private static void doTest(int expected, String name) {
        doTest(expected, name, 30);
    }

    private static void doTest(int expected, String name, int price) {
        assertEquals(expected, billboard(name, price));
    }

    public static void main(String[] args) {
        doTest(600, "Jeong-Ho Aristotelis");
        doTest(570, "Abishai Charalampos");
        doTest(420, "Idwal Augustin");
        doTest(260, "Hadufuns John", 20);
        doTest(570, "Zoroaster Donnchadh");
        doTest(450, "Claude Miljenko");
        doTest(165, "Werner V?gi", 15);
        doTest(420, "Anani Fridumar");
        doTest(270, "Paolo Oli");
        doTest(600, "Hjalmar Liupold", 40);
        doTest(390, "Simon Eadwulf");
    }

}
