package Practice;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        // create a calculator
        // Lets ask user to enter first number
        // Then ask user to enter second number
        // And then select the operation

        Scanner cal = new Scanner(System.in);

        System.out.println("Welcome to Calculator ");
        System.out.println("Please enter the first number: ");
        double firstNumber = cal.nextDouble();

        System.out.println("Please enter second number: ");
        double secondNumber = cal.nextDouble();

        System.out.println("1) Select 1 for Multiplication \n2) Select 2 for Division \n3) Select 3 for Addition \n4) Select 4 for Subtraction");
        int operation = cal.nextInt();


        /*
        if(operation==1){
            System.out.println(firstNumber*secondNumber);
        }
        if(operation==2){
            System.out.println(firstNumber/secondNumber);
        }
        if(operation==3){
            System.out.println(firstNumber+secondNumber);
        }
        if(operation==4){
            System.out.println(firstNumber-secondNumber);
        }

*/
        switch (operation){
        case 1:
            double result = firstNumber*secondNumber;
            System.out.println("The result is: "+result);
            break;

        case 2:
            double result2 = firstNumber/secondNumber;
            System.out.println("The result is: "+result2);
            break;

        case 3:
            double result3 = firstNumber+secondNumber;
            System.out.println("The result is: "+result3);
            break;

        case 4:
            double result4 = firstNumber-secondNumber;
            System.out.println("The result is: "+result4);
            break;
        default:
            System.out.println("Operation is invalid");


    }

}
}