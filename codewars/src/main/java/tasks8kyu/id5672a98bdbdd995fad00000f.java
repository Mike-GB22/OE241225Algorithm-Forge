//2024.10.09
//Rock Paper Scissors
//Let's play! You have to return which player won! In case of a draw return Draw!.
//
//Examples(Input1, Input2 --> Output):
//
//"scissors", "paper" --> "Player 1 won!"
//"scissors", "rock" --> "Player 2 won!"
//"paper", "paper" --> "Draw!"
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5672a98bdbdd995fad00000f {
    public static String rps(String p1, String p2) {
        if(p1.equals(p2)) return "Draw!";
        if(p1.length() == 4 && p2.length() == 8
            || p1.length() == 8 && p2.length() == 5
            || p1.length() == 5 && p2.length() == 4) return "Player 1 won!";
        return "Player 2 won!";
    }

    public static void main(String[] args) {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", rps("rock", "scissors"));
        assertEquals("Player 1 won!", rps("scissors", "paper"));
        assertEquals("Player 1 won!", rps("paper", "rock"));

        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", rps("scissors", "rock"));
        assertEquals("Player 2 won!", rps("paper", "scissors"));
        assertEquals("Player 2 won!", rps("rock", "paper"));

        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", rps("scissors", "scissors"));
        assertEquals("Draw!", rps("paper", "paper"));
        assertEquals("Draw!", rps("rock", "rock"));
    }
}
