package Day05_IfStatement;

public class c4_PositiveNegative {
    // We want to check if the number is positive, negative or 0 (Zero)
    public static void main(String[] args) {

        int number = 0;

        if(number>0){

            System.out.println("the number : "+number);

            System.out.println("The number " +number+ " is Positive");
        }

        if(number<0){
            System.out.println("The number " +number+" is Negative");
        }

        if(number == 0){

            System.out.println("The number " +number+" is Zero");
        }

    }

}



