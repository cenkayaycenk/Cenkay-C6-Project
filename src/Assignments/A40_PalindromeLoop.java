package Assignments;

import java.util.*;

public class A40_PalindromeLoop {
    /*
    Write code where:
- User is asked to enter a string,
- Use that string to see how many of 3 character substring is Palindrome
- Print All the substring Palindrome Substrings
- Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
PS = This is a little hard question please give your best and
make sure you only use the things we have learned so far.
     */

    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String subString = "";
        int count=0;
        for (int i = 0; i <= s1.length() - 3; i++) {
            subString = s1.substring(i, i + 3);
            boolean b1 = false;

            String rev = "";

            for (int j = subString.length() - 1; j >= 0; j--) {
                rev = rev + subString.charAt(j);
            }
            if (subString.equals(rev)){
                b1=true;
                count++;
                System.out.println("SubString Palindrome: "+subString);
            }else {
                b1=false;
            }



        }
        System.out.println("count = " + count);
    }
}


