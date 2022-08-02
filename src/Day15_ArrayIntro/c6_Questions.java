package Day15_ArrayIntro;

import java.util.Scanner;

public class c6_Questions {
    //  - Write a code where user is asked to enter a number
    //     - Print the sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; i += 2) { // 0,2 =2 ,4 =6,6,8,10,12......number is reached.
            if (sum + i > 390) {
                break;
            } else {
                sum = sum + i; //0+2+4+6+8+10+12......number // 0+2+4+6+37  +++> 380 +60 = 440
            }


        }
        System.out.println("the Sum is: " + sum);

    }
}
