// 2025.02.15
// Tip Calculator
// Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.
// You need to consider the following ratings:
//
// Terrible: tip 0%
// Poor: tip 5%
// Good: tip 10%
// Great: tip 15%
// Excellent: tip 20%
// The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
//
// "Rating not recognised" in Javascript, Python and Ruby...
// ...or null in Java
// ...or -1 in C#
//Because you're a nice person, you always round up the tip, regardless of the service.

package tasks8kyu;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class id56598d8076ee7a0759000087 {
    private static final Map<String, Integer> tips = getTips();

    public static Integer calculateTip(double amount, String rating) {
        Integer tipsPercent = tips.get(rating.toLowerCase());
        if (tipsPercent != null) {
            return (int) Math.ceil(amount * tipsPercent / 100);
        }
        return null;
    }

    private static Map<String, Integer> getTips() {
        Map<String, Integer> tips = new HashMap<>();
        tips.put("terrible", 0);
        tips.put("poor", 5);
        tips.put("good", 10);
        tips.put("great", 15);
        tips.put("excellent", 20);
        return tips;
    }

    public static void main(String[] args) {
        assertEquals(new Integer(2), calculateTip(30d, "poor"));
        assertEquals(new Integer(4), calculateTip(20d, "Excellent"));
        assertNull(calculateTip(20d, "hi"));
        assertEquals(new Integer(17), calculateTip(107.65, "GReat"));
    }
}
