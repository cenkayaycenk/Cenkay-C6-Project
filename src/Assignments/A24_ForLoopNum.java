package Assignments;

public class A24_ForLoopNum {
    //Write a code where all where prints all the numbers between 0 and 10 (included)

    public static void main(String[] args) {
        System.out.println("All the numbers between 0 and 10");
        int count=0;
        for(int i=0; i<=10; i++){
            count++;
            System.out.print(" "+i);
        }
        System.out.println("\nThere are "+count+" numbers");
    }
}
