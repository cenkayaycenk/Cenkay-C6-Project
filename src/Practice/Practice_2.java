package Practice;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {



    //Write a Java program to get a number from the user and print whether it is positive or negative.

    Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number");

        int x=input.nextInt();

        if (x>0){
            System.out.println(x + " is a positive number");
        } else if (x<0) {
            System.out.println(x + " is a negative number");
        }else {
            System.out.println("Number is Zero");

        }







    }
}
