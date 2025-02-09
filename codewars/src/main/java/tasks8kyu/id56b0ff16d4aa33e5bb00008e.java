// 2025.02.09
// Remove the time
// Task Description
// You're re-designing a blog, and the blog's posts have the Weekday Month Day, time format for showing the date and time when a post was made, e.g., Friday May 2, 7pm.
// You're running out of screen real estate, and on some pages you want to display a shorter format, Weekday Month Day that omits the time.
// Write a function that takes the website date/time in its original string format and returns the shortened format.
// Input will always be a string, e.g., "Friday May 2, 7pm".
// Output will be the shortened string, e.g., "Friday May 2".
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id56b0ff16d4aa33e5bb00008e {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(","));
    }

    public static void main(String[] args) {
        assertEquals("Friday May 2", shortenToDate("Friday May 2, 9am"),"Failed for input: \"Friday May 2, 9am\"");
        assertEquals("Tuesday January 29", shortenToDate("Tuesday January 29, 10pm"),"Failed for input: \"Tuesday January 29, 10pm\"");
        assertEquals("Monday December 25", shortenToDate("Monday December 25, 10pm"),"Failed for input: \"Monday December 25, 10pm\"");
    }
}
