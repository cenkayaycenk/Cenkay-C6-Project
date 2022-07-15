package Practice;

import java.util.Scanner;

public class Practice_7 {
    public static void main(String[] args) {
        /* INTERVIEW QUESTION.


         * Task : Write a program that checks if a String is a Palindrome.
         *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */
        System.out.println("Please enter a string: ");
        Scanner input= new Scanner(System.in);
        String str=input.next();
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev+" is your string reversed.");
        if (str.equals(rev)){
            System.out.println("The word you entered is a palindrome.");
        }else {
            System.out.println("The word you entered is not a palindrome.");
        }

    }
}

