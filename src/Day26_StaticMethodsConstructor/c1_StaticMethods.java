package Day26_StaticMethodsConstructor;
import My_Util.StaticTestClass;
import My_Util.breaking;

public class c1_StaticMethods {
    public static void main(String[] args) {


        System.out.println("Print Static int variable: "+StaticTestClass.Name);
        System.out.println("Print the Static num: "+StaticTestClass.num);
        //System.out.println("Print the non Static name2: "+StaticTestClass.Name2);

        breaking.Lines();

        StaticTestClass obj=new StaticTestClass();
        System.out.println("Print the non Static name2: "+obj.Name2);
        System.out.println("Print the non Static num2: "+ obj.num2);


        System.out.println("Print the Static Name: "+obj.Name);

        System.out.println("Print the Static num2: "+obj.num);

    }
}
