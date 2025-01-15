//2025.01.15
//Implement the function generateRange which takes three arguments (start, stop, step) and returns the range of integers from start to stop (inclusive) in increments of step.
//
//Examples
//(1, 10, 1) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//(-10, 1, 1) -> [-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1]
//(1, 15, 20) -> [1]
//Note
//start < stop
//step > 0
//Performance test. Start: -100000000, stop: 100000000, step: 11
//[generate with FOR           ]: 3139 millis
//[generate with STREAM.RANGE  ]: 2607 millis
//[generate with STREAM.ITERATE]: 365 millis
package tasks8kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id55eca815d0d20962e1000106Test {
    public static int[] generateRange(int min, int max, int step) {
        return IntStream.rangeClosed(min, max).filter(x -> (x - min) % step == 0).toArray();
    }

    public static int[] generateIterate(int min, int max, int step) {
        return IntStream.iterate(min, i -> i <= max, i -> i + step).toArray();
    }

    public static Integer[] generateFor(int min, int max, int step) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i += step) {
            list.add(i);
        }
        return list.toArray(new Integer[0]);
    }

    private static final int START = -100_000_000;
    private static final int STOP = 100_000_000;
    private static final int STEP = 11;

    public static void main(String[] args) {
        System.out.print("Performance test. ");
        System.out.printf("Start: %d, stop: %d, step: %d%n", START, STOP, STEP);

        timer("generate with FOR           ", () -> generateFor(START, STOP, STEP));
        timer("generate with STREAM.RANGE  ", () -> generateRange(START, STOP, STEP));
        timer("generate with STREAM.ITERATE", () -> generateIterate(START, STOP, STEP));
    }

    private static <T> void timer(String title, Callable<T> c) {
        long start, dauert;
        try {
            start = System.currentTimeMillis();
            T t = c.call();
            dauert = System.currentTimeMillis() - start;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.printf("[%s]: %d millis%n", title, dauert);
    }
}
