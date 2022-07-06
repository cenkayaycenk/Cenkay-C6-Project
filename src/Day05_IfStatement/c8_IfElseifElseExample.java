package Day05_IfStatement;

public class c8_IfElseifElseExample {
    // 100 - 90 will result A grade
    //  89-80  will result B grade
    // 79 - 70 will result C grade
    // 69 - 60 will result D grade
    // 59 - 0 will result F grade
    public static void main(String[] args) {

        int Point = 95;
        if(Point>100){
            System.out.println("Point is invalid");
        }
        else if(Point>=90){
            System.out.println("The Grade is A");
        }
        else if(Point>=80 ){
            System.out.println("The Grade is B");
        }
        else if(Point>=70){
            System.out.println("The Grade is C");

        }
        else if (Point>=60 ){
            System.out.println("The Grade is D");
        }
        else{
            System.out.println("The Grade is F");
        }


    }
}

