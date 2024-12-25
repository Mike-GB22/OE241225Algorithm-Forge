//2024.10.07
//Formatting decimal places #0
//Each number should be formatted that it is rounded to two decimal places.
// You don't need to check whether the input is a valid number because
// only valid numbers are used in the tests.
//
//        Example:
//        5.5589 is rounded 5.56
//        -3.3424 is rounded -3.34
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5641a03210e973055a00000d {

    public static double TwoDecimalPlaces(double number)
    {
        //Write your code here
        return Double.parseDouble(String.format("%.2f", number).replace(',','.'));
    }

    public static void main(String[] args) {
        assertEquals(4.66, TwoDecimalPlaces(4.659725356), 0.00);
        assertEquals(173735326.38, TwoDecimalPlaces(173735326.3783732637948948), 0.00);
        assertEquals(-3.34, TwoDecimalPlaces(-3.3424), 0.00);
        assertEquals(5.56, TwoDecimalPlaces(5.5589), 0.00);
        assertEquals(6.00, TwoDecimalPlaces(5.999), 0.00);
        assertEquals(0.01, TwoDecimalPlaces(0.009), 0.00);
        assertEquals(0.01, TwoDecimalPlaces(0.005), 0.00);
        assertEquals(0.00, TwoDecimalPlaces(0.004), 0.00);
    }
}
