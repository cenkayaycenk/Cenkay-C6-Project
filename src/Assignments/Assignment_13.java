package Assignments;

import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        //Write a program where User is being asked to enter the first name,
        //and last name and print the full name on the console based on given information.

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your first name");
        String name=scan.next();
        System.out.println("Please enter your last name");
        String lastName=scan.next();

        System.out.println("Your full name is " + "\n" +name + " " + lastName);
    }
}
