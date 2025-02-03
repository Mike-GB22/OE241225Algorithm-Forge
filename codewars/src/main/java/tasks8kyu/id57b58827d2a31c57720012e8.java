// 2025.02.03
// Fuel Calculator: Total Cost
// In this kata you will have to write a function that takes litres and pricePerLitre (in dollar) as arguments.
// Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more litres get a discount of 10 cents per litre, and so on every two litres, up to a maximum discount of 25 cents per litre. But total discount per litre cannot be more than 25 cents. Return the total cost rounded to 2 decimal places. Also you can guess that there will not be negative or non-numeric inputs.
// Good Luck!
// Note
// 1 Dollar = 100 Cents

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57b58827d2a31c57720012e8 {
    private static final int DISCOUNT_CENTS_PRO_STEP = 5;
    private static final int MAX_DISCOUNT_CENTS = 25;
    private static final int LITERS_PRO_DISCOUNT_STEP = 2;
    private static final double CENTS_PRO_DOLLAR = 100.0;

    public static double fuelPrice(int litres, double priceDolorPerLitre) {
        int discountCents = litres / LITERS_PRO_DISCOUNT_STEP * DISCOUNT_CENTS_PRO_STEP;
        if (discountCents > MAX_DISCOUNT_CENTS) {
            discountCents = MAX_DISCOUNT_CENTS;
        }
        int resultCents  = (int) Math.round(litres * (priceDolorPerLitre * CENTS_PRO_DOLLAR - discountCents));
        return resultCents / CENTS_PRO_DOLLAR;
    }

    public static void main(String[] args) {
        assertEquals(5.65d, fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, fuelPrice(5, 5.6d),  0.001d);
    }
}
