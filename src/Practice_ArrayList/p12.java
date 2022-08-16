package Practice_ArrayList;

import My_Util.breaking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class p12 {
    public static void main(String[] args) {

            // Create an array list
        ArrayList<String> names= new ArrayList<>();

            // Add elements to array list
        names.add("Cenkay");
        names.add("Gulay");
        names.add("Seray");
        names.add("Onur");
        names.add("Cevdet");
        names.add("Recep");

            // print arraylist
        System.out.println("names = " + names);

        breaking.Lines();



            // Access ArrayList Elements by index number
        names.get(0); // Cenkay
        names.get(2); // Seray
        System.out.println("Fist element of the arraylist is : "+names.get(0));

        breaking.Lines();

            //  Find the index number of an element
        System.out.println("Index number of 'Onur' is : "+names.indexOf("Onur"));
        System.out.println("Index number of 'Cevdet' is : "+names.indexOf("Cevdet"));

        breaking.Lines();

            // Change ArrayList Elements
        names.set(5, "Ali"); // Recep ====> Ali
        names.set(names.indexOf("Cenkay"),"Meral");// Cenkay ====> Meral
        System.out.println(names);

        breaking.Lines();

            // Remove ArrayList Elements
        names.remove("Cevdet"); // it will remove Cevdet from arraylist
        names.remove("Onur"); // it will remove Onur from arraylist
        System.out.println(names);

        breaking.Lines();

            // Accessing individual elements by using for-each Loop
        int k=0;
        for (String elements:names){
            k++;
            System.out.println(k+". element of arraylist is : "+elements);
        }

        breaking.Lines();

            // Length of the arraylist.
        System.out.println("Length of the array list is : "+names.size());

        breaking.Lines();

            // Sorting ArrayList in Ascending order.
        Collections.sort(names);
        System.out.println(names);

        breaking.Lines();

            // Sorting Arraylist in descending order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);

        breaking.Lines();

            // Removing duplicates from ArrayList using LinkedHashSet
        names.add("Seray"); // add duplicates
        names.add("Gulay"); // add duplicates

        LinkedHashSet<String> str=new LinkedHashSet<String>(); // Creating LinkedHashSet
        System.out.println(names);

        str.addAll(names); // Adding ArrayList elements to the LinkedHashSet
        names.clear(); //  Removing ArrayList elements
        names.addAll(str); // Adding LinkedHashSet elements to the ArrayList
        System.out.println(names);

        breaking.Lines();

            // Create a new arraylist with the same element, size, and capacity.
        names.clone();
        System.out.println(names.clone());

        breaking.Lines();

            //Searches the arraylist for the specified element
        boolean contain=names.contains("Ali");
        System.out.println(contain); // Ali is arraylist----output true

        breaking.Lines();

            // Specifies the total element the arraylist can contain.
        names.ensureCapacity(8);

            // Checks if the arraylist is empty.
        System.out.println(names.isEmpty()); // arraylist is not empty---output false

        breaking.Lines();

            // Remove Multiple Elements
        // remove element between 1 to 3
        names.subList(0,2).clear();
        System.out.println("Updated ArrayList: " + names);



    }
}
