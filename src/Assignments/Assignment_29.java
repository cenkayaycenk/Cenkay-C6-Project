package Assignments;

import java.util.Scanner;

public class Assignment_29 {
    /** INTERVIEW QUESTION.
     * Task : Write a program that checks if a String is a Palindrome.

     * Example: input : Java , output: java is not  palindrome
     * Example: input : kayak , output : kayak is a palindrome
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str=scan.next();
        String reverseStr="";   int strLength= str.length();

        for(int i=(strLength-1); i>=0; i--){
            reverseStr+=str.charAt(i);
        }System.out.println("Reverse of entered String is : "+reverseStr);
        System.out.println("-------------");
        if(str.equals(reverseStr)){
            System.out.println(str+" is a Palindrome String");
        }else {
            System.out.println(str+" is not a Palindrome String");
        }
    }
}
