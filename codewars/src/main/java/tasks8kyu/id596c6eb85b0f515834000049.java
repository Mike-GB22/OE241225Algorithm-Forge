//2024.10.21
//FIXME: Replace all dots
//The code provided is supposed replace all the dots . in the specified String str with dashes -
//But it's not working properly.
//
//Task
//Fix the bug so we can all go home early.
//
//Notes
//String str will never be null.
package tasks8kyu;
import static org.junit.jupiter.api.Assertions.*;
public class id596c6eb85b0f515834000049 {
    public static String replaceDots(final String str) {
        return str.replaceAll("[.]", "-");
    }

    public static void main(String[] args) {
        assertEquals("one-two-three", replaceDots("one.two.three"), "Sorry, try again :-(");
    }
}
