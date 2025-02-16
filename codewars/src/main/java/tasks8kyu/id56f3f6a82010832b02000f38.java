// 2025.02.16
// Be Concise I - The Ternary Operator
// Be Concise I - The Ternary Operator
// You are given a function describeAge / describe_age that takes a parameter age (which will always be a positive integer) and does the following:
// 
// If the age is 12 or lower, it return "You're a(n) kid"
// If the age is anything between 13 and 17 (inclusive), it return "You're a(n) teenager"
// If the age is anything between 18 and 64 (inclusive), it return "You're a(n) adult"
// If the age is 65 or above, it return "You're a(n) elderly"
// Your task is to shorten the code as much as possible. Note that submitting the given code will not work because there is a character limit of 137.
// 
// I'll give you a few hints:
// 
// The title itself is a hint - if you're not sure what to do, always research any terminology in this description that you have not heard of!
// Don't you think the whole "You're a(n) <insert_something_here>" is very repetitive? ;) Perhaps we can shorten it?
// Write everything in one line, \n and other whitespaces counts.
// Whatever you do, do not change what the function does. Good luck :)
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id56f3f6a82010832b02000f38 {
    public static String describeAge(int age) {
        return "You're a(n) " + (age < 13 ? "kid" : age < 18 ? "teenager" : age < 65 ? "adult" : "elderly");
    }

    public static void main(String[] args) {
        assertEquals("You're a(n) kid", describeAge(9));
        assertEquals("You're a(n) kid", describeAge(10));
        assertEquals("You're a(n) kid", describeAge(11));
        assertEquals("You're a(n) kid", describeAge(12));
        assertEquals("You're a(n) teenager", describeAge(13));
        assertEquals("You're a(n) teenager", describeAge(14));
        assertEquals("You're a(n) teenager", describeAge(15));
        assertEquals("You're a(n) teenager", describeAge(16));
        assertEquals("You're a(n) teenager", describeAge(17));
        assertEquals("You're a(n) adult", describeAge(18));
        assertEquals("You're a(n) adult", describeAge(19));
        assertEquals("You're a(n) adult", describeAge(63));
        assertEquals("You're a(n) adult", describeAge(64));
        assertEquals("You're a(n) elderly", describeAge(65));
        assertEquals("You're a(n) elderly", describeAge(66));
        assertEquals("You're a(n) elderly", describeAge(100));
    }
}
