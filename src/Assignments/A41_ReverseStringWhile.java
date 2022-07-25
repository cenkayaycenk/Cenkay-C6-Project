package Assignments;

import java.util.Scanner;

public class A41_ReverseStringWhile {

    ////Create a program that will reverse a string , Please use While loop.

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = Scan.nextLine();
        String reverseStr = "";
        int i = str.length() - 1;
        while (i >= 0) {
            reverseStr += str.charAt(i);i--;}
        System.out.println("Reverse of String is : " + reverseStr);
    }
}