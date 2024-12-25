//2024.10.07
//v2 RegularEx
//Abbreviate a Two Word Name
//Description:
//        Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//        The output should be two capital letters with a dot separating them.
//        It should look like this:
//        Sam Harris => S.H
//        patrick feeney => P.F
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57eadb7ecd143f4c9c0000a3v2 {
    public static String abbrevName(String fullName){
        return fullName.replaceAll("^(.).* (.).*", "$1.$2").toUpperCase();
    }

    public static void main(String[] args) {
        assertEquals("S.H", abbrevName("Sam Harris"));
        assertEquals("P.F", abbrevName("Patrick Feenan"));
        assertEquals("E.C", abbrevName("Evan Cole"));
        assertEquals("P.F", abbrevName("P Favuzzi"));
        assertEquals("D.M", abbrevName("David Mendieta"));
        assertEquals("D.M", abbrevName("david mendieta"));
    }
}

