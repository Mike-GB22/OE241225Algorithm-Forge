// 2025.02.06
// Color Ghost
// Create a class Ghost
// Ghost objects are instantiated without any arguments.
// Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
//
// Ghost ghost = new Ghost();
// ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
package tasks8kyu;

import java.util.Random;

public class id53f1015fa9fe02cbda00111a {
    private static final Random random = new Random();
    private static final String[] colors = {"white", "yellow", "purple", "red"};

    class Ghost {
        public String getColor() {
            return colors[random.nextInt(colors.length)];
        }
    }

}
