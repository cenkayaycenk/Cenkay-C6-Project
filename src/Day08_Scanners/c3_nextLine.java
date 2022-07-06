package Day08_Scanners;

import java.util.Scanner;

public class c3_nextLine {
    public static void main(String[] args) {
        // 2) nextLine() this will read everything on the line and assign it to String:
        Scanner fullName = new Scanner(System.in);
        System.out.println("Please enter your full name: ");

        String name = fullName.nextLine();

        System.out.println("The Full name is: " +name);

        name = fullName.nextLine();
        System.out.println("The Full name is: " +name) ;





    }
}

