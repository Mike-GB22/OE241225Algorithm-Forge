//20250128
//Closest elevator
//Given 2 elevators (named "left" and "right") in a building with 3 floors (numbered 0 to 2), write a function accepting 3 arguments (in order):
//left - The current floor of the left elevator
//right - The current floor of the right elevator
//call - The floor that called an elevator
//It should return the name of the elevator closest to the called floor ("left"/"right").
//
//In the case where both elevators are equally distant from the called floor, choose the elevator to the right.
//You can assume that the inputs will always be valid integers between 0-2.
//
//Examples:
//left right call   result
//0    1     0    "left"
//0    1     1    "right"
//0    1     2    "right"
//0    0     0    "right"
//0    2     1    "right
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5c374b346a5d0f77af500a5a {
    public static String call(int left, int right, int call) {
        if (Math.abs(left - call) - Math.abs(right - call) < 0) {
            return "left";
        }
        return "right";
    }

    public static void main(String[] args) {
        assertEquals("right", call(0, 0, 0), "call(0, 0, 0)");
        assertEquals("left", call(0, 1, 0), "call(0, 1, 0)");
        assertEquals("left", call(0, 2, 0), "call(0, 2, 0)");
    }
}