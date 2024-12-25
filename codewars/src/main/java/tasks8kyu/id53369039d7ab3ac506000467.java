//2024.10.14
//Convert boolean values to strings 'Yes' or 'No'.
//Description:
//Complete the method that takes a boolean value and return a "Yes" string for true,
// or a "No" string for false.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id53369039d7ab3ac506000467 {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static void main(String[] args) {
        assertEquals(boolToWord(true),"Yes");
        assertEquals(boolToWord(false),"No");
    }
}
