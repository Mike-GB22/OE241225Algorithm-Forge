//20250127
//Quadrants
//Given a point in a Euclidean plane (x and y), return the quadrant the point exists in: 1, 2, 3 or 4 (integer).
// x and y are non-zero integers, therefore the given point never lies on the axes.

package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id643af0fa9fa6c406b47c5399 {
    public static int quadrant(int x, int y) {
        int[][] quadrants = new int[][]{{2, 1},{3, 4}};

        int indexX = x < 0 ? 0 : 1;
        int indexY = y < 0 ? 1 : 0;
        return quadrants[indexY][indexX];
    }

    public static void main(String[] args) {
        sampleTests(1, 1, 2);
        sampleTests(1, 3, 5);
        sampleTests(2, -10, 100);
        sampleTests(3, -1, -9);
        sampleTests(4, 19, -56);
    }

    private static void sampleTests(int expected, int x, int y) {
        assertEquals(expected, quadrant(x, y));
    }
}
