package Assignments;

import java.util.Scanner;

public class A33_BreakNumber {
    //  Write a code where user is asked to enter a number
//  Print the even sum of the even numbers from 0 to entered number(included)
//  but the Sum should not pass 390
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i += 2) {
            sum += i;
            System.out.print(i + " ");

            if (sum >= 390) {
                sum -= i;
                break;
            }
        }
        System.out.println("\nSum of the numbers is :" + sum);
    }
}






