package Day08_Scanners;

import java.util.Scanner;

public class c2_NextandNextLine {

        public static void main(String[] args) {

            // The Strings have 2 ways tio be scanned
            // 1) next() Code will read all  the inputs that can be number or chars, or anything you put in the consul
            // until it sees a space " ";


            Scanner st = new Scanner(System.in);

            System.out.println("put something on the console");

            String fruit= st.next();

            System.out.println("The thing you put is: " +fruit);

            System.out.println("put Veggies on the console");
            String Veggies = st.next();

            System.out.println("The thing you put is: " +Veggies);






        }
    }
