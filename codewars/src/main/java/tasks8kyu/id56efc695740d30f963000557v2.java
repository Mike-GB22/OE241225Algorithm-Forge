//2024.10.13
//altERnaTIng cAsE <=> ALTerNAtiNG CaSe
//Description:
//altERnaTIng cAsE <=> ALTerNAtiNG CaSe
//Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:
//
//toAlternativeString("hello world") == "HELLO WORLD"
//toAlternativeString("HELLO WORLD") == "hello world"
//toAlternativeString("hello WORLD") == "HELLO world"
//toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
//toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
//toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
//toAlternativeString("toAlternatingCase") == "TOaLTERNATINGcASE"
//As usual, your function/method should be pure, i.e. it should not mutate the original string.
package tasks8kyu;

import static java.lang.Character.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class id56efc695740d30f963000557v2 {

    private static String toAlternativeString(String hello_world) {
        return hello_world.chars()
                .map(x -> isUpperCase(x) ? toLowerCase(x)
                    : isLowerCase(x) ? toUpperCase(x) : x)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    public static void main(String[] args) {
        assertEquals("12345", toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", toAlternativeString("1a2b3c4d5e"));
        assertEquals("TOaLTERNATINGcASE", toAlternativeString("toAlternatingCase"));

        assertEquals("HELLO WORLD", toAlternativeString("hello world"));
        assertEquals("hello world", toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", toAlternativeString(toAlternativeString("Hello World")));



        assertEquals("ALTerNAtiNG CaSe", toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }

}
