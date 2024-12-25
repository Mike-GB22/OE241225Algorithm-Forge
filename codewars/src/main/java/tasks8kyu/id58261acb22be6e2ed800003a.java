//2024.10.14
//Volume of a Cuboid
//Description:
//Bob needs a fast way to calculate the volume of a cuboid with three values:
// the length, width and height of the cuboid. Write a function to help Bob with this calculation.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id58261acb22be6e2ed800003a {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        assertEquals(4, getVolumeOfCuboid(1, 2, 2));
        assertEquals(63, getVolumeOfCuboid(6.3, 2, 5));
    }
}
