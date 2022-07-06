package Assignments;

public class Assignment_7 {
    public static void main(String[] args) {
        //task 2:write java program to find
        // the largest among three numbers. 1) Using if-else..if

        int num1= 100;
        int num2= 40;
        int num3= 120;
        String result= "";

    if(num1>num2 && num1>num3){
        result= num1 + " is the largest number";
    } else if (num2>num1 && num2>num3){
        result= num2 + " is the largest number";
    }else {result= num3 + " is the largest number";}
        System.out.println(result);

    }
}
