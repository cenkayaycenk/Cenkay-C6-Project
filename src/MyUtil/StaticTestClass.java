package MyUtil;

public class StaticTestClass {

    public static int num = 30;
    public static String Name = "Cenkay";
    public int num2 = 25;
    public String Name2 = "Bulent";

    public static void PrintStatic(){
        System.out.println("this is from Static method");
    }

    public void Print(){
        System.out.println("this is from non-static method");
    }

}
