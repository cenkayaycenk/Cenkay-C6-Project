package Assignments;

import java.util.Scanner;

public class A38_Dublicated {

    /*
    //    (String) Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex:  removeDup("AAABBBCCCDDD")  ==> ABCD
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        String input =scan.nextLine();

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i % input.length()) != input.charAt((i + 1) % input.length())) {
                output += input.charAt(i);
            }
        }
        System.out.println("Duplicated string is : "+output);

    }
}
