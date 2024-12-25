//2024.10.09
//Total amount of points
//Our football team has finished the championship.
//
//        Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.
//        For example: ["3:1", "2:2", "0:1", ...]
//
//        Points are awarded for each match as follows:
//        if x > y: 3 points (win)
//        if x < y: 0 points (loss)
//        if x = y: 1 point (tie)
//        We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.
//        Notes:
//        our team always plays 10 matches in the championship
//        0 <= x <= 4
//        0 <= y <= 4
package tasks8kyu;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5bb904724c47249b10000131 {

    public static int points(String[] matches){
        int score = 0;
        for (String oneMatch : matches){
           score += pointFromOneMatch(oneMatch);
        }
        return score;
    }

    public static int pointFromOneMatch(String oneMatch){
        String scoreOneMatch[] = oneMatch.split(":");
        if(scoreOneMatch.length < 2) throw new IllegalArgumentException();
        int we = Integer.parseInt(scoreOneMatch[0]);
        int they = Integer.parseInt(scoreOneMatch[1]);

        if(we == they) return 1;
        if(we > they) return 3;
        return 0;
    }

    public static void main(String[] args){
        assertEquals(30, points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));

        assertEquals(10, points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));

        assertEquals(0, points(new String[]
                {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));

        assertEquals(15, points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));

        assertEquals(12, points(new String[]
                {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
}
