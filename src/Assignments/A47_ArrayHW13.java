package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A47_ArrayHW13 {
    //Write a code where user is asked to enter for
    //5 employee salaries and store those salaries
    //Then find the average salary of those 5 employees
    public static void main(String[] args) {

        int[] salaries = new int[5];

        int sum = 0;


        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Employee " + (i + 1) + " salary is : ");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            salaries[i] = input;
            sum += salaries[i];

        }
        float ave = sum / salaries.length;
        System.out.println("Salaries : " + Arrays.toString(salaries));
        System.out.println("Sum of the salaries is " + sum);
        System.out.println("Average of salaries is " + ave);


    }


}
