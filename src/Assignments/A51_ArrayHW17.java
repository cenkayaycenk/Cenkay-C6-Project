package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A51_ArrayHW17 {
//    Write a code where user is asked to enter 10 numbers and
//    store those number in the integer array.
//    Print the the max number and all the element in the array
//    (Yo can use Arrays.toString() method)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            int input = scan.nextInt();
            numbers[i] = input;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }

            }
        }
        System.out.println("\n" + Arrays.toString(numbers));
        System.out.println("Maximum number is the array is : " + max);

    }


}





