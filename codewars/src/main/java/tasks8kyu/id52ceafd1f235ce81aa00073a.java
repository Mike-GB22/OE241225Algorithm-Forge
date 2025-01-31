//20250201
//Plural
//We need a simple function that determines if a plural is needed or not. It should take a number, and return true if a plural should be used with that number or false if not. This would be useful when printing out a string such as 5 minutes, 14 apples, or 1 sun.
//You only need to worry about english grammar rules for this kata, where anything that isn't singular (one of something), it is plural (not one of something).
//All values will be positive integers or floats, or zero.

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id52ceafd1f235ce81aa00073a {
    public static boolean isPlural(float f) {
        return f != 1f;
    }

    public static void main(String[] args) {
        assertEquals(true,isPlural(0f));
        assertEquals(true,isPlural(0.5f));
        assertEquals(false,isPlural(1f));
        assertEquals(true,isPlural(100f));
    }
}
