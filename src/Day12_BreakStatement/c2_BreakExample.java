package Day12_BreakStatement;

public class c2_BreakExample {
    public static void main(String[] args) {
        // for(start, end, iter){
        // whatever is in here will run until the end point

        //}
        // break is used to break the code
        String hello  = "Hello";
        String result = "";
        for(int i = 0;i<hello.length();i++){
            // result = result + hello.charAt(i); the end result fot this will be Hel
            if(hello.charAt(i)=='l'){
                break;
            }
            result = result + hello.charAt(i); // The end result will He

        }
        System.out.println(result);
        System.out.println("----------------------------------------");

        // I want to sum the numbers from 0 to 50(included) but If my sum is over 140 I want to stop

        int sum = 0;

        for (int i = 1; i <=10 ; i++) { // i value 0,1,2,3,4,5........50

            //sum =sum+i; // 0+1+2+3+4+5+6.....+50
            if(sum >= 140){
                break;
            }
            sum =sum+i; // 0+1+2+3+4+5+6.....+50

        }
        System.out.println("End Result= "+sum);
        System.out.println("-----------------------");


    }
}
