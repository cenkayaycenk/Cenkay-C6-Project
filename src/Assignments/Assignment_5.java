package Assignments;

public class Assignment_5 {
    public static void main(String[] args) {

//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

        int calls=342;
        double bill=200;


        if (calls >0 && calls <=100){
            bill = 200;
        }else if (calls>100 && calls<=150){
            bill = 200+(calls-100)*0.6;
        }else if (calls >150 && calls <=200){
            bill = 200+50*0.6+(calls-150)*0.5;
        }else if (calls >200){
            bill = 200+50*0.6+50*0.5+ (calls-200)*0.4;
        }else {}

        System.out.println("Total bill is $"+ bill);

    }
}
