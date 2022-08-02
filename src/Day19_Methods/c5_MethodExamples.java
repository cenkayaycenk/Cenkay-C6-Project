package Day19_Methods;

public class c5_MethodExamples {
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (parameter)

    public static void MyFirstMethod(){

        System.out.println("This is my first method");

    }

    public static void SumtheNumbers(int a,int b){

        int sum  = a+b;
        System.out.println("the sum of those two numbers is: "+sum);

        MyFirstMethod(); // Calling a method inside another method



    }

    public static void main(String[] args) {

        MyFirstMethod();
        System.out.println("This is inside of main method");
        // MyFirstMethod();

        SumtheNumbers(7,10);



    }
}
