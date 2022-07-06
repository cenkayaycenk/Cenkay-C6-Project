package Practice;

public class Practice_4 {
    public static void main(String[] args) {

        //Write a program to calculate the monthly telephone bills as per the following rule:
        //Minimum Rs. 200 for up to 100 calls.
        //Plus Rs. 0.60 per call for next 50 calls.
        //Plus Rs. 0.50 per call for next 50 calls.
        //Plus Rs. 0.40 per call for any call beyond 200 calls.


        int call=220;
        double bill=200;
        String result="";


        bill= (call>0 && call<=100)? 200:
                (call>100 && call<=150)? 200+(50*0.60):
                        (call>150 && call<=200)? 200+(50*0.50):
                                 200+((call-100)*0.40);


        System.out.println(bill);










    }
}
