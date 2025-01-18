//2025.01.18
//Accountant time! For a given quantity and price (per mango), calculate the total cost of the mangoes.
//But! Every third mango is free!
//
//Examples
//# ? : Paid mango
//# ? : Free mango
//
//Quantity = 2
//Price = 3
//Total cost ==> 6
//# Paid 2 mangoes for $3 per unit = $6; no mango for free
//# ??
//
//Quantity = 3
//Price = 3
//Total cost ==> 6
//# Paid 2 mangoes for $3 per unit = $6; +1 mango for free
//# ???
//
//Quantity = 5
//Price = 3
//Total cost ==> 12
//# Paid 4 mangoes for $3 per unit = $12; +1 mango for free
//# ???   ??
//
//Quantity = 9
//Price = 5
//Total cost ==> 30
//# Paid 6 mangoes for $5 per unit = $30; +3 mangoes for free
//# ???   ???   ???
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class id57a77726bb9944d000000b06 {
    private static final int NUMBER_OF_FREE_MANGO = 3;

    public static int mango(int quantity, int price) {
        int quantityOfFreeMangoes = quantity / NUMBER_OF_FREE_MANGO;
        return (quantity - quantityOfFreeMangoes) * price;
    }

    private static void doTest(int q, int p, int expected) {
        assertEquals(expected, mango(q, p), String.format("Incorrect answer for quantity = %d, price = %d", q, p));
    }

    public static void main(String[] args) {
        doTest(3, 3, 6);
        doTest(9, 5, 30);
    }
}
