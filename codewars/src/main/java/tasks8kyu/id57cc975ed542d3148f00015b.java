// 2025.03.30 You only need one - Beginner
// You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
// a can contain numbers or strings. x can be either.
// Return true if the array contains the value, false if not.

package tasks8kyu;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57cc975ed542d3148f00015b {
    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (Objects.equals(o, x)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        assertEquals(check(new Object[] {66, 101}, 66), true);
        assertEquals(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }
}
