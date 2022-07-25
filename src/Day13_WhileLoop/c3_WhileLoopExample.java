package Day13_WhileLoop;

import java.util.Scanner;

public class c3_WhileLoopExample {
    public static void main(String[] args) {

        // write a code where user can do multiple calculation without rerunning the code

        Scanner sc = new Scanner(System.in);

        System.out.println("+******** Welcome to Calculator*****=+");
        System.out.println("Please Select the operation 1: for Addition 2: for Subs 3: for multi 4: for division any other number to exit");
        int i = sc.nextInt();
        //double result=0;

        while(i==1 || i == 2 || i == 3 || i == 4){

            System.out.println("Please enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Please enter the second number: ");
            double num2 = sc.nextDouble();
            if(i == 1){
                double result = num1+num2;
                System.out.println("The result is: "+result);
            }
            else if(i == 2){
                double result = num1 - num2;
                System.out.println("The result is: "+result);
            }
            else if(i == 3){
                double result = num1*num2;
                System.out.println("The result is: "+result);
            }
            else{
                double result = num1/num2;
                System.out.println("The result is: "+result);
            }

            System.out.println("Please Select the operation 1: for Addition 2: for Subs 3: for multi 4: for division Any other to Exit");
            i = sc.nextInt();

        }

        System.out.println("You exited the calculator");
    }
}
