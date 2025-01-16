//2025.01.15
//Hey Codewarrior!
//You already implemented a Cube class, but now we need your help again! I'm talking about constructors. We don't have one. Let's code one (or more) such that one can instantiate an object via it, handling either no arguments or a single integer.
//Also we got a problem with negative values. Correct the code so negative values will be switched to positive ones!
//The constructor taking no arguments should assign 0 to Cube's Side property.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id55c0ac142326fdf18d0000af {
      /*
  This cube needs help!
  Define a constructor (or more) such that one can instantiate an object
  via it, handling either no arguments or a single integer
  */

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = Math.abs(side) ;
    }

    public id55c0ac142326fdf18d0000af() {
        this(0);
    }

    public id55c0ac142326fdf18d0000af(int side) {
        this.setSide(side);
    }

    public static void main(String[] args) {
        defaultConstructor();
        constructor_positiveSide();
        constructor_negativeSide();
        setter_positiveSide();
        setter_zeroSide();
        setter_negativeSide();
    }

    public static void defaultConstructor() {
        System.out.println("Test default constructor: side should be 0");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af();
        assertEquals(0, c.getSide());
    }

    public static void constructor_positiveSide() {
        System.out.println("Test default constructor: positive side");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af(6);
        assertEquals(6, c.getSide());
    }

    public static void constructor_negativeSide() {
        System.out.println("Test default constructor: negative side");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af(-3);
        assertEquals(3, c.getSide());
    }

    public static void setter_positiveSide() {
        System.out.println("Test setter: positive side");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }

    public static void setter_zeroSide() {
        System.out.println("Test setter: zero side");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af(42);
        c.setSide(0);
        assertEquals(0, c.getSide());
    }

    public static void setter_negativeSide() {
        System.out.println("Test setter: negative side");
        id55c0ac142326fdf18d0000af c = new id55c0ac142326fdf18d0000af(-42);
        c.setSide(-1337);
        assertEquals(1337, c.getSide());
    }
}
