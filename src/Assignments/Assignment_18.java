package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number of months:");
        int Month = s.nextInt();
        System.out.println("Input amount:");
        double Amount = s.nextDouble();
        for(int i = 0; i < Month; i++) {
            Amount += Amount*0.04;
            if(Amount % 1000 != 0) {
                Amount -= Amount % 1000;
                Amount += 1000;
            }
        }
        System.out.println("Amount of debt: ");
        System.out.printf("%.0f\n",Amount);
    }
}


