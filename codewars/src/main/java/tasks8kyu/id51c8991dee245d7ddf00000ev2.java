//2024.10.09
//Reversed Words
//Complete the solution so that it reverses all of the words within the string passed in.
//Words are separated by exactly one space and there are no leading or trailing spaces.
//Example(Input --> Output):
//"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

package tasks8kyu;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class id51c8991dee245d7ddf00000ev2 {
    public static String reverseWords(String str){
        return Arrays.stream(str.split("\\s")).reduce((acc, add) -> add + " " + acc).get();
    }

    public static void main(String[] args) {
        assertEquals("world! hello", reverseWords("hello world!"));
        assertEquals("this like speak doesn't yoda", reverseWords("yoda doesn't speak like this"));
        assertEquals("foobar", reverseWords("foobar"));
        assertEquals("editor kata", reverseWords("kata editor"));
        assertEquals("boat your row row row", reverseWords("row row row your boat"));
        assertEquals("", reverseWords(""));
    }
}
