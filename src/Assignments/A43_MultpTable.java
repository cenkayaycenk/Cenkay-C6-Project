package Assignments;

public class A43_MultpTable {
    //Write a program to display the multiplication table from 1 to 10.
    // Please use nested for loop:

    public static void main(String[] args) {
        System.out.println("<====Multiplication Table====>");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10;j++)

                System.out.print("\t"+i * j+"\t|");
            System.out.println();
        }
    }
}
