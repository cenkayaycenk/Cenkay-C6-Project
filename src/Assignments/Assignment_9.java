package Assignments;

import java.net.Socket;
import java.util.Scanner;

public class Assignment_9 {

    public static void main(String[] args) {


        //Write a code where User is being asked for the first number, second number and third number.
        // Then Compare those number print the maximum number.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number :");
            int number1 = scan.nextInt();
        System.out.println("Please enter the second number :");
            int number2 = scan.nextInt();
        System.out.println("Please enter the third number :");
            int number3 = scan.nextInt();
            int result=0;

            if(number1>number2 && number1>number3){
            result = number1;
            } else if (number2>number1 && number2>number3) {
            result = number2;
            }else {result = number3;}

            System.out.println("Maximum number is :" + result);

    }
}