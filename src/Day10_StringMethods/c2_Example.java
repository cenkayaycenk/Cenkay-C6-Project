package Day10_StringMethods;

import java.util.Scanner;

public class c2_Example {
    public static void main(String[] args) {
        // User is asked to put a valid email(username)
        // Enter a password where the password is at least 9 char.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid email address: ");
        String email = sc.next();

        System.out.println("Enter at least 9 Char password: ");

        String password = sc.next();

        // myemail@GMAIl.coM
        String formatedemail = email.toLowerCase();

        if(!(formatedemail.startsWith("@gmail.com")) && formatedemail.contains("@gmail.com") && formatedemail.endsWith("@gmail.com")){
            System.out.println("Email is valid");


        }else{
            System.out.println("your email is not a valid email");
        }

        if(password.length()>=9){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }



    }
}