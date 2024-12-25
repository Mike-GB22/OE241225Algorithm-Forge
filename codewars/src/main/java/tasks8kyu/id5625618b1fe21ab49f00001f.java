//2024.10.11
//Grasshopper - Debug sayHello
//Description:
//    Debugging sayHello function
//    The starship Enterprise has run into some problem when creating a program to greet everyone as they come aboard. It is your job to fix the code and get the program working again!
//
//    Example output:
//
//    Hello, Mr. Spock
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5625618b1fe21ab49f00001f {
    public static String sayHello(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        assertEquals("Hello, Mr. Spock",
                sayHello("Mr. Spock"));
        assertEquals("Hello, Captain Kirk",
                sayHello("Captain Kirk"));
        assertEquals("Hello, Liutenant Uhura",
                sayHello("Liutenant Uhura"));
        assertEquals("Hello, Dr. McCoy",
                sayHello("Dr. McCoy"));
    }
}
