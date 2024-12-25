//2024.10.21
//Are You Playing Banjo?
//Description:
//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//
//The function takes a name as its only argument, and returns one of the following strings:
//
//name + " plays banjo"
//name + " does not play banjo"
//Names given are always valid strings.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id53af2b8861023f1d88000832v2 {
    public static String areYouPlayingBanjo(String name) {
        return name.concat(
                name.matches("^[Rr].*") ? " plays" : " does not play").concat(" banjo");
    }

    public static void main(String[] args) {
        assertEquals( "Martin does not play banjo", areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", areYouPlayingBanjo("rolf"));
        assertEquals( "bravo does not play banjo", areYouPlayingBanjo("bravo"));
    }
}
