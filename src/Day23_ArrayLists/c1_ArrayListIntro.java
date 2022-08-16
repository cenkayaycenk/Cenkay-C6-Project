package Day23_ArrayLists;

import java.util.ArrayList;

public class c1_ArrayListIntro {
    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects

    // int [] arr=new int[3];
    // ArrayList<DataType>  listName = new ArrayList<DataType>();
    //DataType can not be primitive
    //has to be wrapper class object or different object type
    // String [] name = new String[6];
    // String [] name = {"Ziya","DED',"grt'} ==> arrays are static or size ca not be changed

    //ArrayList: part of Collections
    //			does not support primitives, only support none primitives
    //			size is dynamic, automatically adjusted
    //			has index numbers

    //what is the differences between array and array list
    //1.size = array size is fixed and ; arrraylist size is dynamic (flexible)
    //2.array accepts primitives arraylist doesnt accept primitives
    //3.array is data structure and arraylist is part of collection data structure
    public static void main(String[] args) {

        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        ArrayList<Integer> Listname = new ArrayList<Integer>(); // sise = 0
        // add() -- > this will add eleement at the end of the Arraylist
        Listname.add(90); // === > size of Arraylist will be 1; 90 will be assign to index 0;
        Listname.add(80); // ===> size = 2 === 80 will be assign to index 1;
        Listname.add(84);
        Listname.add(85);
        Listname.add(93);
        Listname.add(90); // === > size = 6 teh index is 5
        System.out.println(Listname);

        // add(index,value) == it will add the value to a specifix index and will move the rest index back

        Listname.add(3,45);

        System.out.println("Add 45 to a specific index: "+ Listname);

        Listname.add(7,100); // add(100)
        System.out.println(Listname);

        //Listname.add(10,100); this will throw an error that out of bound
        // System.out.println(Listname);

        // size() this method will give the size of arraylist

        int sz  = Listname.size(); // that will assign the size of Listname to "sz" variable.

        System.out.println("the size of the Listname is: "+sz);
        System.out.println("_____________________________________________________");

        ArrayList<Integer> List2 = new ArrayList<>(); // the size is 0;

        //int [] name = {2,3,4,5,6,7,8,9};

        List2.add(List2.size(),90); // eqaul to just add()
        List2.add(List2.size(),9); //
        List2.add(List2.size(),98);//add(98)
        List2.add(List2.size(),2);// --add(2)
        System.out.println(List2);

    }
}
