package Assignments;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {

        //Write a code where user is being asked to enter a number and
        // based on the entered number print the number is positive, negative or zero

    Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number=scan.nextInt();

        String result="";

        if(number>0){
            result=" is a Positive number";
        }else if(number<0){
            result=" is a Negative number";
        }else result=" is zero";

        System.out.println("The number is : " + number);
        System.out.println(number + result);

    }
}
