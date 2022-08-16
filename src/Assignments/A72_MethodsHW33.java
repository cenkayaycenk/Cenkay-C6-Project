package Assignments;

import java.util.ArrayList;

public class A72_MethodsHW33 {
    /*
    Write a Method where it takes String and return ArrayList of All the numbers in the String
    ex: String str = "This234 is ju3st St1in6"
    srrlsit = {2,3,4,3,1,6}
    hint in order to check if Character is a number or not
    ( boolean check = Character.isDigit(str.charAt(i) )
     */

    public static void main(String[] args) {

        String sentence = "This234 is ju3st St1in6";
        char[] cArr = sentence.toCharArray();

        ArrayList<String> cArrList = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i)) == true) {
                cArrList.add(String.valueOf(cArr[i]));
            }
        }
        System.out.println("cArrList = " + cArrList);
    }
}
