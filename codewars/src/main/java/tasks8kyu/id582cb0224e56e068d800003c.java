// 2025.03.19 Keep Hydrated!
// Description: Nathan loves cycling.
// Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
// You get given the time in hours and you need to return the number of litres Nathan will drink, rounded down.
// 
// For example:
// time = 3 ----> litres = 1
// time = 6.7---> litres = 3
// time = 11.8--> litres = 5
        
package tasks8kyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id582cb0224e56e068d800003c {

    public static final float LITER_PRO_HOUR = 0.5f;
    public static int liters(double hour)  {
        return (int) (LITER_PRO_HOUR * hour);
    }

    @Test
    @DisplayName("liters(2)")
    public void basicTest1() {
        assertEquals(1, liters(2));
    }

    @Test @DisplayName("liters(0.82)")
    public void basicTest2() {
        assertEquals(0, liters(0.82));
    }

    @Test @DisplayName("liters(12.83)")
    public void basicTest3() {
        assertEquals(6, liters(12.83));
    }

    @Test  @DisplayName("liters(1802.44)")
    public void basicTest4() {
        assertEquals(901, liters(1802.44));
    }

    @Test @DisplayName("liters(60)")
    public void basicTest5() {
        assertEquals(30, liters(60));
    }
}
