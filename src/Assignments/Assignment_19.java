package Assignments;

import java.util.Scanner;

public class Assignment_19 {
    public static void main(String[] args) {
//        Write a code where user is asked to enter a Name,
//        if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
//        If Name Start with “B” and ends with “L” also Contains “A”
//        replace the second character of the name with “G”
//        If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a name");
        String name =scan.nextLine();
        String cl="CLARK";  String cl2="Clark";

        if(name.startsWith("A")&&name.endsWith("L")) {
            name=name.replace("A","B");
        }else if (name.startsWith("B")&&name.endsWith("L")&&name.contains("A")){
            name=name.replace(name.charAt(1), 'G');
        }else if(name.startsWith("C")&&name.endsWith("K")
        || name.startsWith("c")&&name.endsWith("k")){
            if (name.equals(cl)){
                System.out.println("User Name is equal to CLARK");
            }else if(name.equals(cl2)){
                System.out.println("User Name is equal to Clark");
            }else {
                System.out.println("User Name is not equal to CLARK or Clark");
            }
        }System.out.println(name);
    }
}
