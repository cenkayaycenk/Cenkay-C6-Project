package Day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c2_ArrayListMethods {
    public static void main(String[] args) {


        //get(index) --> it is used to get a specific object from the index



        ArrayList<Integer> List1 = new ArrayList<>();

        List1.add(0);
        List1.add(2);
        List1.add(3);
        List1.add(5);
        List1.add(8);

        // List1.size(); //  this will return 5


        int num5 = List1.get(3);

        System.out.println("The number that is in index 3 is: "+num5);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++=");

        // write code that will print every elements inside of arrays list 1 by 1;
        // List1 = [0,2,3,5,8]
        for (int i = 0; i < List1.size(); i++) {

            System.out.println("the number that is in index "+i+" is "+List1.get(i) );

        }

        ///System.out.println("The number that is in index 10 "+List1.get(10)); this will thrwo error out of bound


        //indexof() this will return the index of the value that you specified;


        System.out.println("++++++++++++++++++++++++++");

        ArrayList<Character> CH = new ArrayList<>();

        CH.add('g');
        CH.add('t');
        CH.add('i');
        CH.add('q');
        CH.add('b');

        int indx = CH.indexOf('q');
        System.out.println("the index of 'q' is "+indx);

        // if the item that you want the index for is not in the arraylist it will return -1

        System.out.println("The index of 'a' : "+CH.indexOf('a'));

        CH.add('i');
        // if the item that you want is there multiple times indexOf() will return to the first index that has been founf
        System.out.println("the index of i is: "+CH.indexOf('i'));

        // set(index,item), this takes 2 params, which one is the index the other is the item,

        ArrayList <String> ST = new ArrayList<>();

        ST.add("Eda");
        ST.add("Jason");
        ST.add("Raz");
        ST.add("Yaseen");
        ST.add("Seray");

        System.out.println("The ArrayList is: "+ST);

        ST.set(1,"Sam");
        System.out.println("The ArrayList is: "+ST);

        ST.set(ST.indexOf("Seray"),"Bahar");

        System.out.println("The ArrayList is: "+ST);














    }
}
