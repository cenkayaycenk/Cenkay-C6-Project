package Assignments;

import java.util.Scanner;

public class A39_PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();


        for (int i = 2; i < number / 2; i++) {

            if (number % i == 0) {

                System.out.println(number + " is not a Prime Number");
            } else {

                System.out.println(number + " is a Prime Number");
            }
            break;
        }
    }
}

