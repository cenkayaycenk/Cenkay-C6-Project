package Assignments;

import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {



    //Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
    //In his country, it's usual to tip 15% if the bill value is between 99 and 280.
    //If the value is different, the tip is 20%.
    //
    //Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
    //
    //Example: "The bill was 275, the tip was 41.25, and the total value 316.25

    Scanner scan=new Scanner(System.in);

        System.out.println("Enter the bill amount");
        double bill=scan.nextDouble();
        double tip1=0.15;
        double tip2=0.20;
        double total=0;

            if (bill>99 && bill<=280){
                total= bill+(bill*tip1);
                System.out.println("Bill amount is :" + bill);
                System.out.println("Tip amount is : "+ (total-bill));
                System.out.println("Total bill amount is : " + total);
            }else if(bill>0){
                total= bill+(bill*tip2);
                System.out.println("Bill amount is :" + bill);
                System.out.println("Tip amount is : "+ (total-bill));
                System.out.println("Total bill amount is : " + total);
            }else System.out.println("Invalid Enter");







}
}