package Day05_IfStatement;

public class c3_IfStatementCont {
    // Lets define 3 different numbers
    // Will print the max number
    // Write a code where it compares 3 diff numbers and prints the maximum number
    public static void main(String[] args) {

        int number1 = 199;
        int number2 = 27;
        int number3 = 189;

        /*
        boolean bool1 = number1>number2 && number1>number3;
        boolean bool2 = number2>number1 && number2>number3;
        boolean bool3 = number3>number1 && number3>number2;

         */

        if (number1 > number2 && number1 > number3) {

            System.out.println("The max number is: " + number1);

        }

        if (number2 > number1 && number2 > number3) {

            System.out.println("The max number is: " + number2);

        }

        if (number3 > number1 && number3 > number2) {

            System.out.println("The max number is: " + number3);
        }


    }
}