// 2025.02.24
// Surface Area and Volume of a Box
// Write a function that returns the total surface area and volume of a box as an array: [area, volume]
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class id565f5825379664a26b00007c {
    public static int[] getSize(int w, int h, int d) {
        int value = w * h * d;
        int area = 2 * (d * (w + h) + w * h);

        return new int[]{area, value};
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[] { 88, 48 }, getSize(4, 2, 6));
        assertArrayEquals(new int[] { 6, 1 }, getSize(1, 1, 1));
        assertArrayEquals(new int[] { 10, 2 }, getSize(1, 2, 1));
        assertArrayEquals(new int[] { 16, 4 }, getSize(1, 2, 2));
        assertArrayEquals(new int[] { 600, 1000 }, getSize(10, 10, 10));
    }

}
