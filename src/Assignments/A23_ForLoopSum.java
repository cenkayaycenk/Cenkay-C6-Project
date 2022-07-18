package Assignments;

import java.util.Scanner;

public class A23_ForLoopSum {
    public static void main(String[] args) {
//        Write a code where user is asked to enter a number.
//        Find the sum of all the even numbers between 0 to that number (included)
//        Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int input=scan.nextInt();
        int sumEven=0;  int sumOdd=0;

        System.out.println("Even numbers between ( 0 - "+input+" )");
        for(int i=0; i<=input; i+=2){
            sumEven+=i;
            System.out.print(" "+i);}
        System.out.println("\n* Sum of the even numbers = "+sumEven);
        System.out.println("----------------");
        System.out.println("Odd numbers between ( 0 - "+input+" )");
        for(int i=1; i<=input; i+=2){
            sumOdd+=i;
            System.out.print(" "+i);}
        System.out.println("\n* Sum of the odd numbers = "+sumOdd);
    }
}
