//2025.01.15
//How old will I be in 2099?
//Philip's just turned four and he wants to know how old he will be in various years in the future such as 2090 or 3044. His parents can't keep up calculating this so they've begged you to help them out by writing a programme that can answer Philip's endless questions.
//Your task is to write a function that takes two parameters: the year of birth and the year to count years in relation to. As Philip is getting more curious every day he may soon want to know how many years it was until he would be born, so your function needs to work with both dates in the future and in the past.
//Provide output in this format: For dates in the future: "You are ... year(s) old." For dates in the past: "You will be born in ... year(s)." If the year of birth equals the year requested return: "You were born this very year!"
//"..." are to be replaced by the number, followed and proceeded by a single space. Mind that you need to account for both "year" and "years", depending on the result.
//Good Luck!
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5761a717780f8950ce001473 {
    private static final String TEXT_PATTERN_YOU_WILL_BORN_IN_YEARS = "You will be born in %d year%s.";
    private static final String TEXT_PATTERN_YOU_WERE_BORN_THIS_YEAR = "You were born this very year!";
    private static final String TEXT_PATTERN_YOU_ARE_YEARS_OLD = "You are %d year%s old.";

    public static String calculateAge(int birth, int yearTo) {
        if (birth == yearTo) {
            return TEXT_PATTERN_YOU_WERE_BORN_THIS_YEAR;
        }

        int delta = Math.abs(yearTo - birth);

        String pattern, pluralEnding = delta == 1 ? "" : "s";
        if (birth < yearTo) {
            pattern = TEXT_PATTERN_YOU_ARE_YEARS_OLD;
        } else {
            pattern = TEXT_PATTERN_YOU_WILL_BORN_IN_YEARS;
        }

        return String.format(pattern, delta, pluralEnding);
    }

    public static void main(String[] args) {
        assertEquals("You are 4 years old.", calculateAge(2012, 2016));
        assertEquals("You are 27 years old.", calculateAge(1989, 2016));
        assertEquals("You are 90 years old.", calculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", calculateAge(2000, 1990));
        assertEquals("You were born this very year!", calculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", calculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", calculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", calculateAge(2010, 1500));
        assertEquals("You are 1 year old.", calculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", calculateAge(2000, 1999));        
    }
}
