package Assignments;

import java.util.Random;
import java.util.Scanner;

public class A42_GuessNumber {

    /**
     * // Guessing game
     * //Please follow the step in the below
     * <p>
     * // Step 1-  Create 2 int variables with name of randomNumber , userInput;
     * <p>
     * //Step 2- Create a program will generate random a number between 1 to 10
     * <p>
     * to generate a random number use >>
     * <p>
     * Random random=new Random();
     * int randomNumber = random.nextInt(10) + 1;
     * <p>
     * <p>
     * // Step 2- Ask user to enter a number to enter a number between 1-10
     * <p>
     * //Step 3-  Create a logic with do while loop that will ask user
     * to enter a number as long as random number and userInput are not matching.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*******WELCOME TO GUESSING GAME******** +\nPlease enter a number between ( 1-10)");
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;int UserInput = scan.nextInt();
        int guess= 0;
        do {
            System.out.println("Your number is "  + UserInput
                    + " \nNumbers are not matching"+"\nPlease TRY AGAIN !!!");
            UserInput = scan.nextInt();guess++;
        } while (UserInput != randomNumber);
        if (UserInput == randomNumber) ;
        System.out.println("Your number is " + UserInput
                + " \nNumbers are matching"+"\nCongratulations...You WIN !!!");
    }
}




