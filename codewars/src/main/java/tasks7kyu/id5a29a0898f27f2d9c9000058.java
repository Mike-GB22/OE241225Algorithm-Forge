//2024.10.06
//Simple string characters
//Solve("*'&ABCDabcde12345") = [4,5,5,3].
//--the order is: uppercase letters, lowercase, numbers and special characters.
package tasks7kyu;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class id5a29a0898f27f2d9c9000058 {

    static int[] upperCase = {'A','Z'};
    static int[] lowerCase = {'a','z'};
    static int[] number = {'0', '9'};

    //2024.10.07
    public static int[] solve(String word) {
        int[] array = new int[4];
        Iterator iter = word.chars().iterator();
        while(iter.hasNext()){
            int character = (int) iter.next();
            if(character >= upperCase[0] && character <= upperCase[1]) array[0]++;
            else if(character >= lowerCase[0] && character <= lowerCase[1]) array[1]++;
            else if(character >= number[0] && character <= number[1]) array[2]++;
            else array[3]++;
        }
        return array;
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
