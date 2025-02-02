// 2025.02.02
// Age Range Compatibility Equation
// Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself). It's the 'recommended' age range in which to date someone.
// minimum age <= your age <= maximum age
//
// Task
// Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.
//
// This equation doesn't work when the age <= 14, so use this equation instead:
// min = age - 0.10 * age
// max = age + 0.10 * age
// You should floor all your answers so that an integer is given instead of a float (which doesn't represent age). Return your answer in the form [min]-[max]
//
// ##Examples:
// age = 27   =>   20-40
// age = 5    =>   4-5
// age = 17   =>   15-20
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5803956ddb07c5c74200144e {
    public static String datingRange(int age) {
        double min, max;
        if (age > 14) {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        } else {
            double delta = 0.1 * age;
            min = age - delta;
            max = age + delta;
        }
        return String.format("%.0f-%.0f", Math.floor(min), Math.floor(max));
    }

    public static void main(String[] args) {
        assertEquals("15-20", datingRange(17));
        assertEquals("27-66", datingRange(40));
        assertEquals("14-16", datingRange(15));
        assertEquals("24-56", datingRange(35));
        assertEquals("9-11", datingRange(10));
        assertEquals("7-8", datingRange(8));
    }
}
