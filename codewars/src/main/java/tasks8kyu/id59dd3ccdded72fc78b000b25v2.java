// 2025.02.22
// Return the day
package tasks8kyu;

import java.time.DateTimeException;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id59dd3ccdded72fc78b000b25v2 {
    private static final String ERROR = "Wrong, please enter a number between 1 and 7";

    public static String getDay1(int n) {
        try {
            return java.time.DayOfWeek.of(n).minus(1).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        } catch (DateTimeException e) {
            return ERROR;
        }
    }

    public static String getDay(int n) {
        String t = getDay1(n);
        System.out.println(n + "-> " + t);
        return t;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            getDay(i);
        }
        assertEquals("Sunday",getDay(1));
        assertEquals("Monday",getDay(2));
        assertEquals("Tuesday",getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(20));
    }
}
