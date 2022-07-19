package Assignments;

import java.util.Scanner;

public class A33_StringContinue {
//  Write a code where user is asked to enter a string
//  create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
//  print the new string
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter a string");

    String str=scan.next();
    String result="";

    for (int i=0; i<str.length(); i++){
        if(str.charAt(i)=='L' ||
           str.charAt(i)=='M' ||
           str.charAt(i)=='T' ||
           str.charAt(i)=='E'){
            continue;
        }result+=str.charAt(i);
    } System.out.println(result);

    }




}




