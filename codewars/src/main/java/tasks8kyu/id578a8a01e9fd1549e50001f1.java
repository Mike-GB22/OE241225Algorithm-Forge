//2025.01.14
//Description:
//In this kata, we will make a function to test whether a period is late.
//
//Our function will take three parameters:
//last - The Date object with the date of the last period
//today - The Date object with the date of the check
//cycleLength - Integer representing the length of the cycle in days
//
//Return true if the number of days passed from last to today is greater than cycleLength. Otherwise, return false.

package tasks8kyu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id578a8a01e9fd1549e50001f1 {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return today.isAfter(last.plusDays(cycleLength));
    }

    private static void doTest(LocalDate last,LocalDate today,int cycleLength,boolean expected) {
        boolean actual = periodIsLate(last,today,cycleLength);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String l = last.format(formatter);
        String t = today.format(formatter);
        String testDescription = "Testing where last = "+l+" and today = "+t;
        assertEquals(actual, expected, testDescription);
    }

    public static void main(String[] args) {
        doTest(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35, false);
        doTest(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28, true);
    }
}
