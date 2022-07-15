package Assignments;

import java.util.Scanner;

public class Assignment_21 {
    public static void main(String[] args) {

//        Write a code where user is asked to enter an integer number:
//        1) Using the given number find the factorial of that number and Print the result.
//        example: 5 ==> 5! = 5*4*3*2*1 = 120

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number :");
        int input=scan.nextInt();
        long fact=1;

        for (int i=1; i<=input; i++){
            fact *= i;
        }System.out.println(input+"!"+"="+fact);

    }
}
