package Day23_ArrayLists;

import java.util.ArrayList;

public class c3_ArrayListEx {
    public static void main(String[] args) {
        // remove(index) -- > removed the element in that index

        ArrayList<String> SH = new ArrayList<>();

        SH.add("Deniz");
        SH.add("Gulay");
        SH.add("Banu");

        System.out.println("The List is: "+SH);

        SH.remove(1);
        System.out.println("The List is: "+SH);

        // remove(Object) -- it takes the object as well
        SH.remove("Banu");

        System.out.println("The List is: "+SH);

        ArrayList<Integer> IN = new ArrayList<>();

        IN.add(0); // index 0
        IN.add(1); // index 1
        IN.add(5);
        IN.add(2);
        IN.add(4); // index 4
        System.out.println("the List for IN is: "+IN);

        ///IN.remove(2);
        IN.remove(Integer.valueOf(2));

        System.out.println("the List for IN is: "+IN);

        IN.remove(2);
        System.out.println("the List for IN is: "+IN);

    }

}
