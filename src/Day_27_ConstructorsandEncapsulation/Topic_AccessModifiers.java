package Day_27_ConstructorsandEncapsulation;

import MyUtil.AccessModiftest;

public class Topic_AccessModifiers {
    //			Access modifiers: public, protected, default, private
    // access modifiers explain your access level to the variable ,method or class

    //Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.
    //Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    //Protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    //Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.
    public char ch = 'z';
    private char ch1 = 'h';
    protected char ch2 = 's';
    char ch3 = 'e';

    public static void main(String[] args) {
        Topic_AccessModifiers tp = new Topic_AccessModifiers();

        System.out.println("ch "+tp.ch);
        System.out.println("ch1 "+tp.ch1);
        System.out.println("ch2 "+tp.ch2);
        System.out.println("ch3 "+tp.ch3);

        AccessModif ac = new AccessModif();

        System.out.println("num "+ac.num);
        //System.out.println("num1 "+ac.num1); // Since it is in the different Class with Private method we can NOT access it
        System.out.println("num2 "+ac.num2);
        System.out.println("num3 "+ac.num3);

        AccessModiftest tst = new AccessModiftest();

        System.out.println("name "+tst.name);
        //System.out.println("name1 "+tst.name1); can not be accessed because it is private
        //System.out.println("name2 "+tst.name2); // can not be accessed because it is protected
        //System.out.println("name3 "+tst.name3); // can not be accessed because it is defaults


    }


}
