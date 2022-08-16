package Day24_ArrayListBulk;

import java.util.ArrayList;
import java.util.Arrays;

public class c1_ArrayListBulkOperations {
    public static void main(String[] args) {
        //addAll(Collection) // it will add all the values in the collection to the arraylist

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4); // add to index 0 ;
        System.out.println(list);

        list.addAll(Arrays.asList(1,2,3,4,5,2,1423)); // bulk adding

        System.out.println(list);

        ArrayList<Integer> List1 = new ArrayList<>();

        Integer [] arr={9,6,7,8,3,4,5,6,2,4};
        List1.addAll(Arrays.asList(arr));

        System.out.println(List1);

        // ArrayList <Integer> newlist = new ArrayList<>();

        //newlist = Arrays.asList(arr);



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // contailsAll(CollectionType):
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(34);

        System.out.println("Does it contains 34: "+list2.contains(3));

        list2.addAll(Arrays.asList(90,33,67,23,12,21,78,98));

        System.out.println("The list after the bulk operation is: "+list2);

        boolean b = list2.containsAll(Arrays.asList(33,67,23,12));
        System.out.println("The result is: "+b);

        // remove
        //  list2.remove(); it will remove one item
        // removeAll() will remove a collection of numbers
        list2.removeAll(Arrays.asList(90,33,21));
        System.out.println("The list after the bulk operation remove is: "+list2);

        // retainAll() it will retain the collection and get rid of the rest
        System.out.println("_____________________________________________");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(90,34,56,321,78,2,2,4,3,3,90));
        System.out.println("The new list is: "+list4);
        list4.retainAll(Arrays.asList(2,3,90));

        System.out.println("The new values: "+list4);









    }
}
