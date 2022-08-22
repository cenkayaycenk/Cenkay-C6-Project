package Day_26StaticMethodsConstructors;
import MyUtil.StaticTestClass;
import MyUtil.StaticTestClass;

public class Topic2_StaticMehodCont {

    //When a method is declared with static keyword, it is known as static method.
// Any static member can be accessed before any objects of its class are created,
// and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.
    public void TestNonStatic(){
        System.out.println("This is from the other NonStatic Method");

    }

    public void Test(){
        TestNonStatic();// Can be called since it is not declerared as Static
        System.out.println("This is from Non-static");
    }
    public static void StaticMethod(){
        System.out.println("Hello from Static Method: ");
    }


    public static void main(String[] args) {

        StaticTestClass.PrintStatic();
        StaticTestClass ins = new StaticTestClass();
        ins.Print();

        StaticMethod();

        Topic2_StaticMehodCont Ojb1 = new Topic2_StaticMehodCont();

        Ojb1.Test();
        Ojb1.StaticMethod();

        //TestNonStatic(); // When calling a non-static method from a static method it will throw error.




    }
}
