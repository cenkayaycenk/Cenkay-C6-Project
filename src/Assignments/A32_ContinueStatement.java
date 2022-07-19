package Assignments;

import java.util.Scanner;

public class A32_ContinueStatement {
//  Write a code where user is asked to enter a integer number
//  print all the numbers that can NOT be divided by 2, or 5 and Also can be divided by 7
//  between 1 to entered number(included) (use the Continue Statement)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integar");

        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0 || i % 5 == 0 || i % 7 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
