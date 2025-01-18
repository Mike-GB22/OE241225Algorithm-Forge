//2025.01.18
//Description:
//Given an array of 4 integers
//[a,b,c,d] representing two points (a, b) and (c, d), return a string representation of the slope of the line joining these two points.
//For an undefined slope (division by 0), return undefined . Note that the "undefined" is case-sensitive.
//a:x1        b:y1        c:x2        d:y2
//Assume that [a,b,c,d] and the answer are all integers (no floating numbers!). Slope: https://en.wikipedia.org/wiki/Slope
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55a75e2d0803fea18f00009d {
    private static final String UNDEFINED = "undefined";
    public static String slope(int[] points) {
        int deltaX = points[2] - points[0];
        int deltaY = points[3] - points[1];
        if (deltaX == 0) {
            return UNDEFINED;
        } else {
            return String.format("%d", deltaY / deltaX);
        }
    }

    public static void main(String[] args) {
        int[] test1={19,3,20,3};
        assertEquals("0",slope(test1));

        assertEquals("undefined",slope(new int[]{-7,2,-7,4}));
        assertEquals("5",slope(new int[]{10,50,30,150}));
        assertEquals("-5",slope(new int[]{15,45,12,60}));
        assertEquals("6",slope(new int[]{10,20,20,80}));
        assertEquals("undefined",slope(new int[]{-10,6,-10,3}));
    }



}
