package Assignments;

import java.util.Scanner;

public class A37_ReverseNumber {
    /*
  Write a code where it ask user to enter an integer number
- Reverse the given number and print the result
- Example input ( 5678 )
- Example output ( 8765 )
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number = scan.nextInt();
        int numRev = 0;

        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            numRev = numRev * 10 + remainder;
        }
        System.out.println("Reverse is : " + numRev);
    }
}
