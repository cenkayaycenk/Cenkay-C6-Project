package Assignments;

import java.util.Scanner;

public class A36_WhileLoop {

    /*
 -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
- based on the point the code should automatically determine the grade of Student with the full name of the student
- This should be done for each student
- Assuming we do not know how many student are there but your code should still handle this situation
-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
- When the point is between 90 to 100 the grade should be A
- When the point is between 80 to 90(excluded) the grade should be B
- When the point is between 70 to 80(excluded) the grade should be C
- When the point is between 60 to 70 (excluded) the grade should be D
- When the point is less than 60 the grade should be F
- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<===== Welcome ====>");
        System.out.println("Student's First Name: ");
        String name = scanner.next();
        System.out.println("Student's Last Name: ");
        String lastName = scanner.next();
        System.out.println("Student's Score: ");
        double score = scanner.nextDouble();
        String grade = "";
        while (true) {
            if (score >= 90 && score <= 100) {grade = "A";
            } else if (score >= 80 && score < 90) {grade = "B";
            } else if (score >= 70 && score < 80) {grade = "C";
            } else if (score >= 60 && score < 70) {grade = "D";
            } else if (score < 60 && score >= 0) {grade = "F";
            } else {break;}
            System.out.println("First Name = " + name + "\nLast Name = " + lastName + "\nGrade: " + grade);
            System.out.println("Student's First Name: ");
            name = scanner.next();
            System.out.println("Student's Last Name: ");
            lastName = scanner.next();
            System.out.print("Student's Score: ");
            score = scanner.nextDouble();
        }System.out.println("You logged out of the system");
    }
}






