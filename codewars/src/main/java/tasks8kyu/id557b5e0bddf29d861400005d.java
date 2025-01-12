//2025.01.12
//Sometimes, I want to quickly be able to convert miles per imperial gallon (mpg) into kilometers per liter (kpl).
//Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
//Make sure to round off the result to two decimal points.
//Some useful associations relevant to this kata:
//1 Imperial Gallon = 4.54609188 litres
//1 Mile = 1.609344 kilometres

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id557b5e0bddf29d861400005d {
    private static final double LITTER_IN_GALLON = 4.54609188;
    private static final double KM_IN_MILE = 1.609344;

    public static void main(String[] args) {
        doTest(10, 3.54);
        doTest(20, 7.08);
        doTest(30, 10.62);
        doTest(4145, 1467.36);
    }

    public static double mpgToKPM(int mpg) {
        return Math.round(mpg * KM_IN_MILE / LITTER_IN_GALLON * 100) / 100.0;
    }

    private static void doTest(int mpg, double expected) {
        double actual = mpgToKPM(mpg);
        String message = String.format("mpg = %d, kpl = %f, but expected: %f", mpg, actual, expected);
        System.out.println(message);
        assertEquals(expected, actual, 1e-3, message);
    }
}
