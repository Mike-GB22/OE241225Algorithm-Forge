//Smallest unused ID
//Hey awesome programmer!
//You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!
//Therefore you need a method, which returns the smallest unused ID for your next new data item...
//Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!
//Go on and code some pure awesomeness!

package tasks8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55eea63119278d571d00006a {
    public static int nextId(int[] ids) {
        List<Integer> idsList = Arrays.stream(ids).boxed().toList();
        return IntStream.rangeClosed(0, Integer.MAX_VALUE).filter(id -> !idsList.contains(id)).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        assertEquals(4, nextId(new int[] { 0, 1, 2, 3, 5 }));
        assertEquals(4, nextId(new int[] { 1, 2, 0, 2, 3 }));
        assertEquals(4, nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        assertEquals(11, nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }
}
