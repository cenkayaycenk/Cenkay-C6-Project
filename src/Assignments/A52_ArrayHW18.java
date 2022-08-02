package Assignments;

import java.util.Scanner;

public class A52_ArrayHW18 {
//    Write a code where user is asked to enter a number to between
//    1 to 7 to get the name of the day of the week.User Array
//    ex. When user enters 1 you should print (Monday)


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Please enter a number between (1-7) ");

        int input = scan.nextInt();
        if (input >= 1 && input <= 7) {
            for (int i = 1; i < days.length; i++) {
                if (input == i) {
                    System.out.println("\n" + input + ". day of the week is :" + days[i-1]);
                }
            }
        } else {
            System.out.println("Sorry");
        }


    }
}
