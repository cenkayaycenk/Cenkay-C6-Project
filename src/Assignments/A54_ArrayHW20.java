package Assignments;

import java.util.Scanner;

public class A54_ArrayHW20 {
//    Write a code where user is asked to enter a sentence,
//    find how many of the character 'a'(ignore the case) is in the sentence and
//    where is the index of that specific 'a' in the sentence.
//    ex. "A cat was found on the street of Nashville"
//    answer:
//            "A" is in index of 0,
//            "a" is in index of 3.
//            "a" is in index of 7.
//            "a" is in index of 23.
//             Count of "a"s is : 4

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sent = scan.nextLine();
        int count = 0;
        char[] arr = sent.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A') {
                System.out.println(arr[i] + " is in index of " + i);
                count++;
            }
        }
        System.out.println("\nCount is : " + count);
    }
}




