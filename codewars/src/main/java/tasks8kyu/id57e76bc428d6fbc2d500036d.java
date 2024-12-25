//2024.10.09
//Convert a string to an array
//Write a function to split a string and convert it into an array of words.
//
//        Examples (Input ==> Output):
//        "Robin Singh" ==> ["Robin", "Singh"]
//
//        "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id57e76bc428d6fbc2d500036d {

    public static String[] stringToArray(String s) {
        return s.split("\\s");
    }

    public static void main(String[] args) {
        assertArrayEquals(new String[]{"Robin", "Singh"}, stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, stringToArray("I love arrays they are my favorite"));
    }
}
