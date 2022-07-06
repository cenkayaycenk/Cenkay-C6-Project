package Day06_IfElseContinue;

public class c4_MultipleTernary {
    public static void main(String[] args) {
        // number is 0 just say zero
        // if is even just say even
        // or if it is odd just say it is odd
        int num = 0;
        String result;

        if(num == 0 ){

            result = "Zero";

        }
        else if(num % 2 == 0){
            result = "Even";
        }
        else result = "Odd";

        result = (num == 0) ? "Zero" :(num % 2 == 0) ? "Even" : "Odd";


        System.out.println("The number is: "+result);
    }
}















