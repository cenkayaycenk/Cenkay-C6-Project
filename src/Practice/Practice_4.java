package Practice;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        System.out.println("We created a new algorithm to take your name and redefine it the ziya way, please enter your first name: ");
        Scanner name=new Scanner(System.in);
        String firstname=name.next();
        String cla= "CLARK";
        String clar="clark";

        if (firstname.startsWith("A") && firstname.endsWith("L")){
            firstname= firstname.replace("A","B");
        }else if (firstname.startsWith("B") && firstname.endsWith("L") && firstname.contains("A")){
            char ch = 'G';
            firstname= firstname.substring(0,1) + ch + firstname.substring(2,3);
        }else if (firstname.startsWith("C")&& firstname.endsWith("K") || firstname.startsWith("c") && firstname.endsWith("k")) {
            if (firstname.equals(cla)){
                System.out.println("The name you entered is equal to CLARK");
            } else if (firstname.equals(clar)) {
                System.out.println("The name you entered is equal to clark");

            }
        }

        System.out.println("Processed through our algorithm your name is: "+firstname);

    }
}
