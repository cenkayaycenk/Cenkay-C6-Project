package Assignments;

import java.util.Scanner;

public class Assignment_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        String result;

        System.out.println("WELCOME TO MY CALCULATOR");
        System.out.println("Please enter the first Number: ");
        number1 = input.nextInt();
        System.out.println("Please enter the second Number: ");
        number2 = input.nextInt();
        System.out.println("Please select an operation \n * for Multiplication \n / for Division " +
                "\n + for Addition \n - for Subtraction \n % for Mod");
        char operator = input.next().charAt(0);

        if(operator == '*'){
            result = (number1 * number2)+"";
        } else if (operator == '/') {
            result = (number1 / number2)+"";
        } else if (operator == '+') {
            result = (number1+number2)+"";
        }else if (operator == '-'){
            result = (number1-number2)+"";
        } else if (operator == '%') {
            result = (number1 % number2)+"";}
        else {
            result = "The operation is not valid!";
        }
        System.out.println("Result is " + result);

    }
}



