//2025.01.23
//Find out whether the shape is a cube
//To find the volume (centimeters cubed) of a cuboid you use the formula:
//volume = Length * Width * Height
//But someone forgot to use proper record keeping, so we only have the volume, and the length of a single side!
//It's up to you to find out whether the cuboid has equal sides (= is a cube).
//Return true if the cuboid could have equal sides, return false otherwise.
//Return false for invalid numbers too (e.g volume or side is less than or equal to 0).
//Note: side will be an integer
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id58d248c7012397a81800005c {
    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 || side * side * side == volume;
    }

    public static void main(String[] args) {
        assertFalse(isCube( 12,  2), "For input (12, 2)");
        assertFalse(isCube(  8,  3), "For input (8, 3)");
        assertTrue (isCube(  8,  2), "For input (8, 2)");
        assertFalse(isCube( -8, -2), "For input (-8, -2)");
        assertFalse(isCube(  0,  0), "For input (0, 0)");
        assertTrue (isCube( 27,  3), "For input (27, 3)");
        assertFalse(isCube(  1,  5), "For input (1, 5)");
        assertTrue (isCube(125,  5), "For input (125, 5)");
        assertFalse(isCube(125, -5), "For input (125, -5)");
        assertFalse(isCube(  0, 12), "For input (0, 12)");
        assertFalse(isCube( 12, -1), "For input (12, -1)");
        assertTrue (isCube(  1,  1), "For input (1, 1)");
    }
    
}
