//2024.10.11
//Will you make it?
//        You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
//        Considering these factors, write a function that tells you if it is possible to get to the pump or not.
//        Function should return true if it is possible and false if not.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id5861d28f124b35723e00005e {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump/mpg <= fuelLeft;
    }

    public static void main(String[] args) {
        assertTrue(zeroFuel(50, 25, 2));
        assertFalse(zeroFuel(100, 50, 1));
    }
}
