package Day_26StaticMethodsConstructors;

public class Topic5_ConstructorChaining {

    /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later

Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    int a;
    double b;
    String name;
    public Topic5_ConstructorChaining(int a,double dnum,String name){
        this.a = a;
        this.b = dnum;
        this.name = name;
    }

    public static void main(String[] args) {
        Topic5_ConstructorChaining ins1 = new Topic5_ConstructorChaining(30,100.23,"Gulay");
        /*ins1.a = 10;
        ins1.b = 90.456;
        ins1.Name = "Gulay";

         */


        System.out.println("The a value:" +ins1.a);
        System.out.println("The b value:" +ins1.b);
        System.out.println("The Name value:" +ins1.name);
    }
}
