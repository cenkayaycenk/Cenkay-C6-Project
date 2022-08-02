package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A49_ArrayHW15 {
//    Write a code where it ask user to enter a Sentence,
//    Find the longest word in the sentence and print it with the length of it.
//    ex. ,"I love being outside with my dog but I have a lot to do today"
//    asnwer: Outside and the length is 7

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String sent= scan.nextLine();

        String [] array=sent.split(" ");
        String longest=array[0];

        for (int i = 0; i < array.length; i++) {
            if(longest.length()<array[i].length()){
                longest=array[i];
            }

        }
        System.out.println("The longest word is : "+longest+"\nThe length of longest word is : "
                +longest.length());

    }


}
