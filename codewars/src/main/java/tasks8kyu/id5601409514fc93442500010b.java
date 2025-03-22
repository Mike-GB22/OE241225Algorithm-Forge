// 2025.03.22
// How good are you reall
// There was a test in your class and you passed it. Congratulations!
// But you're an ambitious person. You want to know if you're better than the average student in your class.
// 
// You receive an array with your peers' test scores. Now calculate the average and compare your score!
// Return true if you're better, else false!
// 
// Note: Your points are not included in the array of your class's points. Do not forget them when calculating the average score!

package tasks8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5601409514fc93442500010b {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double averageScore = IntStream.concat(IntStream.of(yourPoints), Arrays.stream(classPoints)).average().getAsDouble();
        if (averageScore < yourPoints) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        tests();
    }
    public static void tests() {
        assertEquals(true, betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, betterThanAverage(new int[] {100, 90}, 11));
    }
}
