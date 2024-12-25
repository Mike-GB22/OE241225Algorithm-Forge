//2024.10.07
//Do I get a bonus?
//It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?
//        Build a function that takes in two arguments (salary, bonus).
//        Salary will be an integer, and bonus a boolean.
//        If bonus is true, the salary should be multiplied by 10.
//        If bonus is false, the fatcat did not make enough money and must receive only his stated salary.
//        Return the total figure the individual will receive as a string prefixed with
//        "?" (= "\u00A3", JS, Go, Java, Scala, and Julia), "$" (C#, C++, Dart, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) or "?" (Rust).
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id56f6ad906b88de513f000d96 {
    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!
        return String.format("?%d",(salary * (bonus?10:1)));
    }

    public static void main(String[] args) {
        basicTests();
    }
    public static void basicTests() {
        assertEquals("?100000", bonusTime(10000, true));
        assertEquals("?250000", bonusTime(25000, true));
        assertEquals("?10000", bonusTime(10000, false));
        assertEquals("?60000", bonusTime(60000, false));
        assertEquals("?20", bonusTime(2, true));
        assertEquals("?78", bonusTime(78, false));
        assertEquals("?678900", bonusTime(67890, true));
    }
}
