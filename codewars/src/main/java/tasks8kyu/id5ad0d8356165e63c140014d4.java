//2025.02.01
//Student's Final Grade
//Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.
//This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);
//This function should return a number (final grade). There are four types of final grades:
//100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
//90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
//75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
//0, in other cases
//Examples(Inputs-->Output):
//100, 12 --> 100
//99, 0 --> 100
//10, 15 --> 100
//85, 5 --> 90
//55, 3 --> 75
//55, 0 --> 0
//20, 2 --> 0
//*Use Comparison and Logical Operators.
package tasks8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id5ad0d8356165e63c140014d4 {
    public static int finalGrade(int exam, int projects) {
        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 && projects > 4) {
            return 90;
        } else if (exam > 50 && projects > 1) {
            return 75;
        }
        return 0;
    }

    public static void main(String[] args) {
        assertEquals(100, finalGrade(99, 1), "Testing with exam = 99 and projects = 1");
        assertEquals( 90, finalGrade(76, 5), "Testing with exam = 76 and projects = 5");
        assertEquals( 75, finalGrade(76, 4), "Testing with exam = 76 and projects = 4");
        assertEquals(  0, finalGrade(52, 1), "Testing with exam = 52 and projects = 1");
    }
}
