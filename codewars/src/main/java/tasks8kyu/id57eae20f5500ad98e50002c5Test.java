//2025.01.14
//Write a function that removes the spaces from the string, then return the resultant string.
//Examples (Input -> Output):

//RESULT
//[noSpaceWithReplaceAll]: We have count of words pattern: 10000000, it toke time in millis: 15871.
//[noSpaceWithStream]    : We have count of words pattern: 10000000, it toke time in millis: 1321.

package tasks8kyu;

import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57eae20f5500ad98e50002c5Test {
    public static String noSpaceWithStream(final String x) {
        return x.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static String noSpaceWithReplaceAll(final String x) {
        return x.replaceAll("\\s*", "");
    }

    private static final int MAX_WORDS = 10_000_000;
    private static final String[] words = new String[]{
            "Hello World!  ", "Bye all ! ! !", "Guten Morgen People!!", "H O W   A R E   Y O U ? ? ?", "YOU TUBE",
            "Face Book #1", "hi! ", "Mama mila ramu! Rama bila dovolna"
    };

    public static void main(String[] args) {
        String x = generateWords();

        timer("noSpaceWithReplaceAll", () -> noSpaceWithReplaceAll(x));
        timer("noSpaceWithStream", () -> noSpaceWithStream(x));
    }

    private static String generateWords() {
        StringBuilder sb = new StringBuilder("Hallochen! ");
        for(int i = 0; i < MAX_WORDS; i++) {
            sb.append(words[i % words.length]);
        }
        return sb.toString();
    }

    private static <T> void timer(String title, Callable<T> c) {
        long start, dauert;
        try {
            start = System.currentTimeMillis();
            T t = c.call();
            dauert = System.currentTimeMillis() - start;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.printf("[%s]: We have count of words pattern: %d, it toke time in millis: %d.%n",
                title,
                MAX_WORDS,
                dauert
        );
    }
}
