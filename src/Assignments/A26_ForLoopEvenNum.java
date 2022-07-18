package Assignments;

public class A26_ForLoopEvenNum {
    ///Write a program that will print the sum of the even numbers
    // between 0-20 * include . Please use for loop and if statement.

    public static void main(String[] args) {

        System.out.println("Even numbers between ( 0-20 )");
        int sum=0;
        for (int i=0; i<=20; i++){
            if(i%2==0){
                sum+=i;
                System.out.print(" "+i);}
        }System.out.println("\nSum of these numbers = "+sum);
    }
}
