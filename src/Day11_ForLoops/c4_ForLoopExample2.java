package Day11_ForLoops;

import java.util.Scanner;

public class c4_ForLoopExample2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner from the user input

        System.out.println("Please enter a String: ");
        String FromScan= scan.next();

        for(int i = 0; i<FromScan.length(); i++){

            if(FromScan.charAt(i)== 'A' || FromScan.charAt(i)== 'a'){ // If the String contains A,
                FromScan = FromScan.toUpperCase(); // Then Make all to Upper Case,
                System.out.println(FromScan);
            }else{
                FromScan = FromScan.toLowerCase(); // Make it lower case
                System.out.println(FromScan); // Print Lo
            }
        }
        System.out.println(FromScan);// The last value of the FromScan.
        // The Last Char is deciding the last value of FromScan String to be either upper or lower case,

    }
}