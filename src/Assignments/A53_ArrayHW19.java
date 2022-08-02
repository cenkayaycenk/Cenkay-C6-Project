package Assignments;

import java.util.Locale;
import java.util.Scanner;

public class A53_ArrayHW19 {
    //    Write a code where user enters a sentence. Find
//    how many of those words contains the "da"(ignore the case) and
//    print the word if it contains "da"(ignore the case)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Sentence");
        String sentence = scan.nextLine();
        String[] strArr = sentence.split(" ");
        sentence = sentence.toLowerCase();
        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("da")) {
                count++;
                System.out.println((count) + " . word which contains 'da' is= " + strArr[i]);
            }
        }

        System.out.println("\n" + count + " words contain 'da'");
    }


}




