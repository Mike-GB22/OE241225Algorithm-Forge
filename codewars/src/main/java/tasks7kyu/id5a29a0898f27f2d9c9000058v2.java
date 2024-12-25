//2024.10.06
//Simple string characters
//Solve("*'&ABCDabcde12345") = [4,5,5,3].
//--the order is: uppercase letters, lowercase, numbers and special characters.
package tasks7kyu;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class id5a29a0898f27f2d9c9000058v2 {
    //20
    public static int[] solve(String str){
        return new int[]{
            str.replaceAll("[^A-Z]", "").length(),
            str.replaceAll("[^a-z]", "").length(),
            str.replaceAll("[^0-9]", "").length(),
            str.replaceAll("[\\w]", "").length()
        };
    }
    public static void main(String[] args) {
        assertArrayEquals(new int[]{1,18,3,2}, solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}