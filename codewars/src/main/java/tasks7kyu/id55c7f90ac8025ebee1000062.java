// 2025.02.14
// Failed Sort - Bug Fixing #4
// Oh no, Timmy's Sort doesn't seem to be working?
// Your task is to fix the sortArray function to sort all numbers in ascending order
package tasks7kyu;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55c7f90ac8025ebee1000062 {
    public static String sortArray(String arrayOfNumbers) {
        return arrayOfNumbers.chars().sorted().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        assertEquals(sortArray("12345"), "12345", "Return a ascending sorted array");
        assertEquals(sortArray("54321"), "12345", "Return a ascending sorted array");
        assertEquals(sortArray("34251"), "12345", "Return a ascending sorted array");
    }
}
