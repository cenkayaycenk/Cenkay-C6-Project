package StudyHalls.Week2;

import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {

        //System.out.println("Hello ");

        //Scanner is used to get data from User.

        //Step1 - Set-up Scanner
        Scanner scanner=new Scanner(System.in); //import java.util.Scanner;

        System.out.println("Hey, what's your name ?");

        // Step2 - Deciding dataType

        // First user's input value will be stored in userName Variable.
        String userName=scanner.nextLine();

      //  System.out.println("userName = " + userName); //userName = renastech

        System.out.println("Hi "+userName +" what's your birthday ?"); //Hi mahir what's your birthday ?

        int userBirthYear=scanner.nextInt(); // second input will be userBirthYear.

        System.out.println("Hey , "+userName +" you are  "+(2022 -userBirthYear) +" years old.");



    }
}
