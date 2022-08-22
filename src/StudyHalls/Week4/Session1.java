package StudyHalls.Week4;

import java.util.Scanner;

public class Session1 {

    public static void main(String[] args) {
        /*
        //Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100 A
//80-89  B
//70-79  C
//60-69  D
//0-59  F
//

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first grade , Input should be between 0 to 100");

        byte input1=scanner.nextByte(); // first data will be input1
        //byte -128 and 127

        System.out.println("Enter your second grade, Input should be between 0 to 100");

        byte input2=scanner.nextByte(); // second data will be input2

        System.out.println("Enter your third grade, Input should be between 0 to 100.");

        byte input3=scanner.nextByte();

        System.out.println("input1 = " + input1); // input1.soutv
        System.out.println("input2 = " + input2);
        System.out.println("input3 = "+ input3);


        //Your program should calculate the average of subjects
        double average=(input1+input2+input3 )/3;

        ////90-100 A
        ////80-89  B
        ////70-79  C
        ////60-69  D
        ////0-59  F
        ////

        String grade=""; // we will use it to store value of the grade

        if (average >=90 && average <=100){ //90-100 A
            grade="A";
        } else if ( average >=80 && average <=89) {//80-89  B
            grade="B";

        }else if(average >=70 && average <=79){ //70-79  C
            grade="C";

        }else  if( average >=60 && average <=69){ //60-69  D
            grade="D";

        }else if ( average >= 0 && average <=59){ //0-59  F
            grade="F";

        }else {

            System.out.println("Something was wrong");
        }

        System.out.println("*********************");
        System.out.println("Grade = "+grade );
        System.out.println("average = " + average);


    }

}
