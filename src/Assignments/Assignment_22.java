package Assignments;

import java.util.Scanner;

public class Assignment_22 {
    public static void main(String[] args) {
//        Write a code where user is asked to enter a number and check for every number
//        between 0 to that number to see how many number between 0 to that number
//        can be divided to 3 and 5 and sum all those number, Print the result

    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=scan.nextInt();
        int count=0;    int sum=0;
        System.out.println("Numbers divided by 3 and 5 between ( 0 - "+input+" )");
        for(int i=0; i<=input; i++){
            if(i%15==0){
                sum+=i; count++;
                System.out.print(" "+i);}
        }System.out.println("\nThere are "+count+" numbers");
         System.out.println("Sum of these numbers = " + sum);
    }
}
