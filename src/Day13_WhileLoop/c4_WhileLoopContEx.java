package Day13_WhileLoop;

import java.util.Scanner;

public class c4_WhileLoopContEx {
    // Same example with the previous one but using while(true)

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("+******** Welcome to Calculator*****=+");
        System.out.println("Please Select the operation 1: for Addition 2: for Subs 3: for multi 4: for division any other number to exit");
        int con = rd.nextInt();

        while(true){
            if (con == 1){
                System.out.println("Please enter first number: ");
                double num1 = rd.nextDouble();
                System.out.println("Please enter Second Number: ");
                double num2 = rd.nextDouble();
                System.out.println("The Result is: "+ (num1+num2));
            }
            else if (con == 2){
                System.out.println("Please enter first number: ");
                double num1 = rd.nextDouble();
                System.out.println("Please enter Second Number: ");
                double num2 = rd.nextDouble();
                System.out.println("The Result is: "+ (num1-num2));
            }
            else if (con == 3){
                System.out.println("Please enter first number: ");
                double num1 = rd.nextDouble();
                System.out.println("Please enter Second Number: ");
                double num2 = rd.nextDouble();
                System.out.println("The Result is: "+ (num1*num2));
            }
            else if (con == 4){
                System.out.println("Please enter first number: ");
                double num1 = rd.nextDouble();
                System.out.println("Please enter Second Number: ");
                double num2 = rd.nextDouble();
                System.out.println("The Result is: "+ (num1/num2));
            }
            else{
                break;
            }
            System.out.println("Please Select the operation 1: for Addition 2: for Subs 3: for multi 4: for division any other number to exit");
            con = rd.nextInt();


        }
        System.out.println("You Exited the Calculator");



    }
}
