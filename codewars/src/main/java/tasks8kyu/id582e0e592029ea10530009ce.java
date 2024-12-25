//2024.10.21
//Duck Duck Goose
//Description:
//The objective of Duck, duck, goose is to walk in a circle, tapping on each player's head until one is chosen.
//
//Task:
//Given an array of Player objects and a position (first position is 1), return the name of the chosen Player.
//name is a property of Player objects, e.g Player.name
//Example:
//duck_duck_goose([a, b, c, d], 1) should return a.name
//duck_duck_goose([a, b, c, d], 5) should return a.name
//duck_duck_goose([a, b, c, d], 4) should return d.name
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id582e0e592029ea10530009ce {
    public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose - 1) % players.length].name;
    }

    public static void main(String[] args) {
    Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});

    assertEquals("a", duckDuckGoose(players, 1));
    assertEquals("c", duckDuckGoose(players, 3));
    assertEquals("z", duckDuckGoose(players, 10));
    assertEquals("z", duckDuckGoose(players, 20));
    assertEquals("z", duckDuckGoose(players, 30));
    assertEquals("g", duckDuckGoose(players, 18));
    assertEquals("g", duckDuckGoose(players, 28));
    assertEquals("b", duckDuckGoose(players, 12));
    assertEquals("b", duckDuckGoose(players, 2));
    assertEquals("f", duckDuckGoose(players, 7));
    }

    private static Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }

    public static class Player{
        String name;
        public Player(String name){
            this.name = name;
        }
    }
}
