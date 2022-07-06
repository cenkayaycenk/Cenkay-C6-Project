package Assignments;

public class Assignment_6 {

    public static void main(String[] args) {

        //task  1: create a java program that will
        // check if number is divisible by 2 and 5 same time

    int number = 25;
    String result = "";

    if(number %2==0 && number %5==0){
        result= number + " is divisible by 2 and 5 at the same time";
    }else {
        result= number + " is not divisible by 2 and 5 at the same time";
    }
        System.out.println(result);

    }
}
