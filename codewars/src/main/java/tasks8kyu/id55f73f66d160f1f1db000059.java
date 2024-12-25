//2024.10.14
//Grasshopper - Combine strings
//Description:
//Combine strings function
//Create a function named combineNames/combine_names/CombineNames that accepts two parameters (first and last name). The function should return the full name.
//
//Example:
//With "James" as the first name and "Stevens" as the last name should return "James Stevens"
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55f73f66d160f1f1db000059 {

    private static String combineNames(String... arg) {
        return Arrays.stream(arg)
                .reduce(new StringBuilder(), (a, b) -> a.append(" " + b), (a, b) -> a.append(" " + b))
                .toString();
    }

    public static void main(String[] args) {
        assertEquals("James Stevens", combineNames("James","Stevens"));
    }
}
