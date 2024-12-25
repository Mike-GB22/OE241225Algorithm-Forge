//2024.10.12
//Is he gonna survive?
//Description:
//A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?
//
//Return true if yes, false otherwise :)
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class id59ca8246d751df55cc00014c {
    public static boolean hero(int bullets, int dragons) {
        return dragons <= bullets / 2;
    }

    public static void main(String[] args) {
        assertTrue(hero(10, 5), "With 10 bullets and 5 dragons");
        assertTrue(hero(100, 40), "With 100 bullets and 40 dragons");

        assertFalse(hero(4, 5), "With 4 bullets and 5 dragons");
        assertFalse(hero(1500, 751), "With 1500 bullets and 751 dragons");
        assertFalse(hero(0, 1), "With 0 bullets and 1 dragon");
        assertFalse(hero(7, 4), "With 7 bullets and 4 dragons");
    }

}
