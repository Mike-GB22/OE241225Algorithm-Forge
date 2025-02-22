// 2025.02.22
// Return the day
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id59dd3ccdded72fc78b000b25 {
    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final String ERROR = "Wrong, please enter a number between 1 and 7";

    public static String getDay(int n) {
        if (n < 1 || n > 7) {
            return ERROR;
        }
        return DAYS[n - 1];
    }

    public static void main(String[] args) {
        assertEquals("Sunday",getDay(1));
        assertEquals("Monday",getDay(2));
        assertEquals("Tuesday",getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(20));
    }
}
