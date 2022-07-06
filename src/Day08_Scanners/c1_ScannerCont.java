package Day08_Scanners;

import java.util.Scanner;

public class c1_ScannerCont {
    public static void main(String[] args) {
        // We are creating a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the short number");
        // How to Scan the Short Data Type input
        short sh = input.nextShort();
        System.out.println("The Short number is; " +sh);

        System.out.println("Please enter the Integer number");
        // Next integer number entered by User.
        int In = input.nextInt();

        System.out.println("The interger number is; " +In);

        System.out.println("Please enter the Double number");

        //Next Double number entered by Users

        double Do = input.nextDouble();

        System.out.println("This is the double number: "+Do);

        // Next Float number;
        System.out.println("Please enter the Float number");
        float fl = input.nextFloat();
        System.out.println("This is the float number: "+fl);




    }
}
