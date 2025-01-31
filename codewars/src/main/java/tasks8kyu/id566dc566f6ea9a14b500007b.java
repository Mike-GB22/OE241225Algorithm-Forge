//20250131
//Filtering even numbers (Bug Fixes)
//The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
//However, there is a bug in the method that needs to be resolved.

package tasks8kyu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id566dc566f6ea9a14b500007b {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
       return listOfNumbers.stream().filter(x -> x % 2 != 0).toList();
    }

    public static void main(String[] args) throws Exception{
        firstTest();
        secondTest();
    }

    public static void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult,filterOddNumber(listOfNumbers));
    }

    public static void secondTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(filterOddNumber(listOfNumbers).toArray()));
    }
}
