//2025.01.13
//The medians of a triangle are the segments that unit the vertices with the midpoint of their opposite sides. The three medians of a triangle intersect at the same point, called the barycenter or the centroid. Given a triangle, defined by the cartesian coordinates of its vertices we need to localize its barycenter or centroid.
//
//The function bar_triang() or barTriang or bar-triang, receives the coordinates of the three vertices A, B and C  as three different arguments and outputs the coordinates of the barycenter O in an array [xO, yO]
//This is how our asked function should work: the result of the coordinates should be expressed up to four decimals, (rounded result).
//You know that the coordinates of the barycenter are given by the following formulas.
//source: imgur.com
//For additional information about this important point of a triangle see at: (https://en.wikipedia.org/wiki/Centroid)
//Let's see some cases:
//barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
//barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}
//The given points form a real or a degenerate triangle but in each case the above formulas can be used.
//Enjoy it and happy coding!!
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5601c5f6ba804403c7000004 {
    private static final double ACCURACY = 10_000D;

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{average(x[0], y[0], z[0]), average(x[1], y[1], z[1])};
    }

    private static double average(double ... a) {
        return Math.round(Arrays.stream(a).average().getAsDouble() * ACCURACY) / ACCURACY;
    }

    public static void main(String[] args) {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(barTriang(
                new double[]{4,6}, new double[]{12,4}, new double[]{10,10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(barTriang(
                new double[]{4,2}, new double[]{12,2}, new double[]{6,10})));
    }
}
