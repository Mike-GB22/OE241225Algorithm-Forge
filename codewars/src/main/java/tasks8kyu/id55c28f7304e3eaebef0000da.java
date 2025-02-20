// 2025.02.20#
// Unfinished Loop - Bug Fixing #1
// Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class id55c28f7304e3eaebef0000da {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>(number);

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }

    private static void doTest(int n, List<Integer> expected) {
        List<Integer> actual = CreateList(n);
        assertEquals(expected, actual, "for n = " + n + "\n");
    }

    public static void main(String[] args) {
        doTest(1, List.of(1));
        doTest(2, List.of(1,2));
        doTest(3, List.of(1,2,3));
        doTest(4, List.of(1,2,3,4));
        doTest(5, List.of(1,2,3,4,5));
    }
}
