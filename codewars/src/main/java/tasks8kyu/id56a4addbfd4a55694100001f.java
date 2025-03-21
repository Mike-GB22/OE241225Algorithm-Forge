// 2025.02.11
// Did she say hallo?
// You received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?
// Write a simple function to check if the string contains the word hallo in different languages.
//
// These are the languages of the possible people you met the night before:
// hello - english
// ciao - italian
// salut - french
// hallo - german
// hola - spanish
// ahoj - czech republic
// czesc - polish
// Notes: you can assume the input is a string.
// to keep this a beginner exercise you don't need to check if the greeting is a subset of word (Hallowen can pass the test)
// function should be case insensitive to pass the tests
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id56a4addbfd4a55694100001f {
    private static final String[] HELLO_WORDS = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc", "privet"};
    public static boolean validateHello(String greetings){
        return Arrays.stream(HELLO_WORDS)
                .anyMatch(word -> greetings.toLowerCase().contains(word.toLowerCase()));
    }

    public static void main(String[] args) {
        assertTrue(validateHello("hello"));
        assertTrue(validateHello("ciao bella!"));
        assertTrue(validateHello("salut"));
        assertTrue(validateHello("hallo, salut"));
        assertTrue(validateHello("hombre! Hola!"));
        assertTrue(validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(validateHello("AHOJ!"));
        assertTrue(validateHello("czesc"));
        assertTrue(validateHello("Ahoj"));
        assertFalse(validateHello("meh"));
    }
}
