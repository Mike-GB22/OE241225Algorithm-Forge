// 2025.02.08
// Holiday VI - Shark Pontoon
// Your friend invites you out to a cool floating pontoon around 1km off the beach. Among other things, the pontoon has a huge slide that drops you out right into the ocean, a small way from a set of stairs used to climb out.
// As you plunge out of the slide into the water, you see a shark hovering in the darkness under the pontoon... Crap!
// You need to work out if the shark will get to you before you can get to the pontoon. To make it easier... as you do the mental calculations in the water you either freeze when you realise you are dead, or swim when you realise you can make it!
//
// You are given 5 variables;
// sharkDistance = distance from the shark to the pontoon. The shark will eat you if it reaches you before you escape to the pontoon.
// sharkSpeed = how fast it can move in metres/second.
// pontoonDistance = how far you need to swim to safety in metres.
// youSpeed = how fast you can swim in metres/second.
// dolphin = a boolean, if true, you can half the swimming speed of the shark as the dolphin will attack it.
// The pontoon, you, and the shark are all aligned in one dimension.
// If you make it, return "Alive!", if not, return "Shark Bait!".
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57e921d8b36340f1fd000059 {
    private static final String MSG_ALIVE = "Alive!";
    private static final String MSG_BAIT = "Shark Bait!";
    private static final double SPEED_MULTIPLIER_FOR_DOLPHIN = 0.5;
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (pontoonDistance / (double) youSpeed >
                sharkDistance / (sharkSpeed * (dolphin ? SPEED_MULTIPLIER_FOR_DOLPHIN : 1.0))) {
            return MSG_BAIT;
        }
        return MSG_ALIVE; // Don't get eaten!
    }

    public static void main(String[] args) {
        assertEquals("Alive!", shark(12, 50, 4, 8, true));
        assertEquals("Alive!", shark(7, 55, 4, 16, true));
        assertEquals("Shark Bait!", shark(24, 0, 4, 8, true));
    }
}

