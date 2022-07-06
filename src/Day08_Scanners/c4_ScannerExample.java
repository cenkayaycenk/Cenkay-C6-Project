package Day08_Scanners;

import java.util.Scanner;

public class c4_ScannerExample {
    // Lets Create a Calculator
    // Lets ask User to enter first number
    // Then ask user to enter second number
    // Select the operation
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATOR ");

        System.out.println("Please enter the first Number: ");
        // Asking user First Number
        double firstNumber = cal.nextDouble();

        System.out.println("Please enter second Number: ");
        double secondNumber = cal.nextDouble();

        System.out.println("1) Select 1 for Multiplication \n2) Select 2 for Division \n3) Select 3 for Addition\n4) Select 4 for Subtraction\n" +
                "5) Select 5 for mod");
        int operation = cal.nextInt();



        switch (operation){

            case 1:
                double result = firstNumber*secondNumber;
                System.out.println("The result is: "+result);
                break;
            case 2:
                double result2 = firstNumber/secondNumber;
                System.out.println("the result is: "+result2);
                break;
            case 3:
                double result3 = firstNumber+secondNumber;

                System.out.println("the result is: "+result3);
                break;
            case 4:
                double result4 = firstNumber - secondNumber;
                System.out.println("the result is: "+result4);
                break;
            case 5:
                double result5 = firstNumber%secondNumber;
                System.out.println("the result is: "+result5);
                break;

            default:
                System.out.println("The operations is not Valid");


        }






    }


}

