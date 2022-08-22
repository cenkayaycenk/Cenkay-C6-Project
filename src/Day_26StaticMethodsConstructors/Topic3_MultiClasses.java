package Day_26StaticMethodsConstructors;

public class Topic3_MultiClasses {

    public static void Name(){
        System.out.println("Print the name: which is:Ziya");
    }
}
class AnotherClass{

    public static void FirstName(){
        System.out.println("The first name is: Gulay");
    }
}
class AnotherOne{
    public static void main(String[] args) {

        AnotherClass.FirstName();
        Topic2_StaticMehodCont.StaticMethod();

        Topic3_MultiClasses.Name();


    }
}
