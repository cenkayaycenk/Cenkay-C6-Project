package Practice;

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {

        Scanner list = new Scanner(System.in);
        String item;
        String item2;
        String item3;
        System.out.println("Welcome to KW Appeal Shop");
        System.out.println("Please select 3 times from category of what you want to buy from the list");
        System.out.println("#Category\t:\t# \n1) Shirt\t:\t1 \n2) Pants\t:\t2 \n3) Dress\t:\t3 \n4) Hat\t\t:\t4 \n5) Shoes\t:\t5");
        System.out.println("Please select your first buying category:");
        int firstCategory = list.nextInt();
        item = (firstCategory == 1) ? "Shirt" : (firstCategory == 2) ? "Pants" : (firstCategory == 3) ? "Dress" : (firstCategory == 4) ? "Hat" : (firstCategory == 5) ? "Shoes" : "Invalid Category";
        if (firstCategory < 1 || firstCategory > 5) {
            System.out.println(item + " not added to chart");
        } else if (firstCategory == 1 || firstCategory == 3 || firstCategory == 4) {
            System.out.println(item + " is added to your chart");
        } else
            System.out.println(item + " are added to your chart");

        System.out.println("Please select your second buying category:");
        int secondCategory = list.nextInt();
        item2 = (secondCategory == 1) ? "Shirt" : (secondCategory == 2) ? "Pants" : (secondCategory == 3) ? "Dress" : (secondCategory == 4) ? "Hat" : (secondCategory == 5) ? "Shoes" : "Invalid Category";
        if (secondCategory < 1 || secondCategory > 5) {
            System.out.println(item2 + " not added to chart");
        } else if (secondCategory == 1 || secondCategory == 3 || secondCategory == 4) {
            System.out.println(item2 + " is added to your chart");
        } else
            System.out.println(item2 + " are added to your chart");

        System.out.println("Please select your third buying category:");
        int thirdCategory = list.nextInt();
        item3 = (thirdCategory == 1) ? "Shirt" : (thirdCategory == 2) ? "Pants" : (thirdCategory == 3) ? "Dress" : (thirdCategory == 4) ? "Hat" : (thirdCategory == 5) ? "Shoes" : "Invalid Category";
        if (thirdCategory < 1 || thirdCategory > 5) {
            System.out.println(item + " not added to chart");
        } else if (thirdCategory == 1 || thirdCategory == 3 || thirdCategory == 4) {
            System.out.println(item3 + " is added to your chart");
        } else
            System.out.println(item3 + " are added to your chart");

        System.out.println("Your cart includes " + item + "," + item2 + " and " + item3);


        double price = 0;
        double price2 = 0;
        double price3 = 0;


        switch (firstCategory) {
            case 1:
                price = 40;
                break;
            case 2:
                price = 60;
                break;
            case 3:
                price = 100;
                break;
            case 4:
                price = 10;
                break;
            case 5:
                price = 120;
                break;
            default:
        }
        switch (secondCategory) {
            case 1:
                price2 = 40;
                break;
            case 2:
                price2 = 60;
                break;
            case 3:
                price2 = 100;
                break;
            case 4:
                price2 = 10;
                break;
            case 5:
                price2 = 120;
                break;
            default:
        }
        switch (thirdCategory) {
            case 1:
                price3 = 40;
                break;
            case 2:
                price3 = 60;
                break;
            case 3:
                price3 = 100;
                break;
            case 4:
                price3 = 10;
                break;
            case 5:
                price3 = 120;
                break;
            default:
        }
        double sum = price + price2 + price3;
        double ratio;

        if (sum > 200) {
            ratio = 20;
        } else if (sum > 150 && sum <= 200) {
            ratio = 15;
        } else if (sum > 100 && sum <= 150) {
            ratio = 5;
        } else {
            ratio = 0;
        }

        System.out.println("\nYour bill is ready: \n" + item + " :\t" + price + "\n" + item2 + " :\t" + price2 + "\n" + item3 + " :\t" + price3 + "\nTotal Price : " + sum + " Dollars");
        System.out.println("Available Discount Ratio: " + ratio + " percent");
        System.out.println("Final Price after Discount: " + sum * (100 - ratio) / 100 + " Dollars");
        System.out.println("Thank you shopping from us. We are wiling to see you again");
    }
}