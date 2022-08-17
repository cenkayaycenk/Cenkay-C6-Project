package Day26_StaticMethodsConstructor;

public class c4_Constructors {
    //constructor is a special method which has to have class name as a method name
    //we create objects from class by using constructor methods
    //if you dont create an contructor java will create one default constroctor for you
    //constructor needs to have same name that class  has

    public c4_Constructors(){
        System.out.println("This is from Constructor");
    }
    public c4_Constructors(int a){
        System.out.println("This is from second constructor with a value "+a);
    }
    public c4_Constructors(String Name, double money){
        System.out.println(Name+ " has lots of "+money);
    }


    public static void main(String[] args) {
        c4_Constructors ob =new c4_Constructors();
        c4_Constructors ob1=new c4_Constructors(90);
        c4_Constructors ob2=new c4_Constructors("sam",90.87);



    }
}
