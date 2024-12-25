//2024.10.14
//Basic Mathematical Operations
//Description:
//Your task is to create a function that does four basic mathematical operations.
//
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
//
//Examples(Operator, value1, value2) --> output
//('+', 4, 7) --> 11
//('-', 15, 18) --> -3
//('*', 5, 5) --> 25
//('/', 49, 7) --> 7
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id57356c55867b9b7a60000bd7v3 {
    public static Integer basicMath(String op, int x, int y){
        int allMath[] = new int[]{
                x + y, x - y, x * y, x / (y != 0 ? y : 1)};
        return allMath["+-*/".indexOf(op)];
    }

    public static void main(String[] args) {
        System.out.println("Basic Tests");
        assertEquals(basicMath("+", 4, 7), is(11));
        assertEquals(basicMath("-", 15, 18), is(-3));
        assertEquals(basicMath("*", 5, 5), is(25));
        assertEquals(basicMath("/", 49, 7), is(7));
    }
    private static int is(int x){
        return x;
    }
}
