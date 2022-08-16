package Day26_StaticMethodsConstructor;
import My_Util.StaticTestClass;

public class c2_StaticMethodCont {


    public void TestNonStatic(){
        StaticTestClass.PrintStatic();

    }
    public void Test(){
        TestNonStatic();
    }


    public static void main(String[] args) {

        StaticTestClass.PrintStatic();
        StaticTestClass ins=new StaticTestClass();
        ins.Print();




    }


}
