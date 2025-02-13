// 2025.02.13
// String Templates - Bug Fixing #5
// Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature,
// Help Timmy with his string template so it works as he expects!
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55c90cad4b0fe31a7200001f {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }

    public static void main(String[] args) {
        assertEquals(buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
        assertEquals(buildString("Cheese","Milk"),"I like Cheese, Milk!");
        assertEquals(buildString("Chocolate"),"I like Chocolate!");
    }
}
