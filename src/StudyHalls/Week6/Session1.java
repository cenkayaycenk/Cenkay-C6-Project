package StudyHalls.Week6;

import java.util.Random;
import java.util.Scanner;

public class Session1 {

    public static void main(String[] args) {

        ////Create a program that will reverse a string , Please use While loop.

        String str="Yaseen";
        //          01234

        int indexNumber=str.length()-1;
        String reverse="";// we will store reverse of str value with this variable.

        while ( 0<=indexNumber){
            //  0<=-1

            reverse+= str.charAt(indexNumber);//m+a

            indexNumber--;// 0--

        }

        System.out.println("reverse = " + reverse);

        System.out.println("********************************");


/**
 *
 * // Guessing game
 * //Please follow the step in the below
 *
 * // Step 1-  Create 2 int variables with name of randomNumber , userInput;
 *
 * //Step 2- Create a program will generate random a number between 1 to 10
 *
 * to generate a random number use >>
 *
 *  Random random=new Random();
 *  int randomNumber = random.nextInt(10) + 1;
 *
 *
 * // Step 2- Ask user to enter a number to enter a number between 1-10
 *
 * //Step 3-  Create a logic with do while loop that will ask user
 * to enter a number as long as random number and userInput are not matching.
 */



    // Step 1-  Create 2 int variables with name of randomNumber , userInput;

        int randomNumber,userInput;


     /* Step 2- Create a program will generate random a number between 1 to 10
 to generate a random number use >>

   Random random=new Random();
  int randomNumber = random.nextInt(10) + 1;

      */





        ////Step 3-  Create a logic with do while loop that will ask user
        // * to enter a number as long as random number and userInput are not matching.


        do {

            Random random=new Random();
           randomNumber = random.nextInt(10) + 1;//0.9 ,

            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter a number between 1-10.");

            userInput=scanner.nextInt();

            System.out.println("Random number was "+randomNumber);



        }while ( userInput !=randomNumber);

        System.out.println("Game is over, you won!");




    }
}
