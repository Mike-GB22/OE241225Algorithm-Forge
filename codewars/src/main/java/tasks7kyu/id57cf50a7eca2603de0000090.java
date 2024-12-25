//2024.10.07
//Move every letter in the provided string forward 10 letters through the alphabet.
//
//        If it goes past 'z', start again at 'a'.
//
//        Input will be a string with length > 0.
package tasks7kyu;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57cf50a7eca2603de0000090 {
    static final int countSymbols = 'z' - 'a' + 1;
    static final int beginForUpperAZ = 'A';
    static final int beginForLowerAZ = 'a';
    static final int endForUpperAZ = 'Z';
    static final int endForLowerAZ = 'z';

    public static String moveTen(String s) {
        // YOUR CODE HERE
        StringBuilder retStr = new StringBuilder();
        for(int character : s.chars().toArray()){
            System.out.print((char) character);
            if(character >= beginForLowerAZ && character <= endForLowerAZ)
                retStr.append(moveTenWithBorder(character, endForLowerAZ));
            else if(character >= beginForUpperAZ && character <= endForUpperAZ)
                retStr.append(moveTenWithBorder(character, endForUpperAZ));
        }
        return retStr.toString();
    }

    public static char moveTenWithBorder(int character, int border){
        System.out.print(" -> " + (char) character);
        if ((character += 10) > border) character -= countSymbols;
        System.out.println(" => " + (char) character);
            return (char) character;
    }

    public static void main(String[] args) {
        assertEquals("docdmkco", moveTen("testcase"));
        assertEquals("mynogkbc", moveTen("codewars"));
        assertEquals("ohkwzvodocdrobo", moveTen("exampletesthere"));
    }
}
