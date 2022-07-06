package Assignments;

import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        // Write a Revenue program, Where user enters the quantity of the products
        // sold and  the price for each product.
        // Then Calculate the revenue based on giving information
        // (hint: Revenue = quantity x price)

        Scanner scan= new Scanner(System.in);
            System.out.println("Please enter the quantity of the products");
            int quantity = scan.nextInt();
            System.out.println("Please enter the price of the product");
            double price = scan.nextDouble();

            double revenue= quantity*price;
        System.out.println("The Revenue is : " + revenue);

    }
}
