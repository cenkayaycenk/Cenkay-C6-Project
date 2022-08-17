package Presentation;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Presentation_1 {

    public static void main(String[] args) {

//The Scanner class is used to get user input,
// and it is found in the java.util package.
//To use the Scanner class,
// create an object of the class and use any of the
// available methods found in the Scanner class documentation.



Scanner scan=new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstname=scan.nextLine(); // read user input

        System.out.println("Enter your lastname");
        String lastname=scan.nextLine();

        System.out.println("Enter Id number");
        int id=scan.nextInt();

        System.out.println("Enter your year of birth");
        int year=scan.nextInt();
        int age=2022-year; // it will give us users age

        System.out.println("Enter your salary/year");
        double salary=scan.nextDouble();
        String result="";
        if(salary>=75000)result="Great !!! Keep going like that";
        else if(salary>0 && salary<75000)result="You need to work more";

        System.out.println("Enter your year of starting work");
        int start=scan.nextInt();
        int workTime= 2022-start;

        System.out.println("Your name is : "+ firstname+" "+lastname+
                "\nYour Id number is : " + id+
                "\nYour age is : " + age+
                "\nYour salary is : "+salary+
                "\nYou have been working for "+workTime+" years"+
                "\n"+ result);





















    }
}
