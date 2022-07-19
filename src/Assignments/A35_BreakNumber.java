package Assignments;

import java.util.Scanner;

public class A35_BreakNumber {
// Write a code where the the user is asked to enter an integer number
// sum of all the odd numbers between 1 to given number (included)
// but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
// The sum should not exceed 300

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integar");
        int n1 = scan.nextInt();
        int s1 = 0;

        for (int i = 1; i <= n1; i += 2) {

            if (i == 9 || i == 11 || i == 23 || i == 35) {
                continue;
            } else {
                System.out.print(i + " ");
            }

            if (s1+i < 300) {
                s1 += i;
            }
        }
        System.out.println("\nThe sum is: " + s1);
    }

}










