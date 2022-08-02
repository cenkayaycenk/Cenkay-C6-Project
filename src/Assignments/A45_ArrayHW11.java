package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A45_ArrayHW11 {
    //   Write   a   program   that   creates   an   array   of   10   elements   size.
    //   Your   program   should   prompt   the   user   to   input
    //   numbers   in   array   and   then   display   the   sum   of   all
    //   array   elements.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int sum = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            int num = scan.nextInt();
            numbers[i] = num;
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of the number is : " + sum);
    }

}

