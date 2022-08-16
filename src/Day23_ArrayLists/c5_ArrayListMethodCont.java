package Day23_ArrayLists;

import java.util.ArrayList;

public class c5_ArrayListMethodCont {
    public static void main(String[] args) {
        // contains(object obj) --> this method will check if arraylist has that object in the list
        // if its returns true else it returns false
        ArrayList<Integer> ArrL = new ArrayList<>();
        ArrL.add(3);
        ArrL.add(2);
        ArrL.add(0);
        ArrL.add(8);
        ArrL.add(39);
        System.out.println("The list is : "+ArrL);

        boolean isThere = ArrL.contains(60);
        System.out.println("the Answer is: "+isThere);

        System.out.println("The number 0 is in the Arraylist: "+ArrL.contains(0));

        // equals() it check if 2 arraylist are equal if they are it will return true else it will return false

        ArrayList<Integer> ArrL2 = new ArrayList<>();
        ArrL2.add(2);
        ArrL2.add(3);
        ArrL2.add(0);
        ArrL2.add(8);
        ArrL2.add(39);

        System.out.println("are the equal?: "+ArrL.equals(ArrL2));
        int k=0;
        for(Integer elements : ArrL2){
            k++;
            System.out.println("elements "+k+ "= " + elements);
        }


        // isEmpty()-  it checks if array lit is empty. If it is it will return true else it will return false

        ArrayList<Character> CHarr = new ArrayList<>();

        CHarr.add('R');

        System.out.println("Is it empty: "+CHarr.isEmpty());

        // clear(), it clears the arrayList

        CHarr.clear();// It clears all the objects in the List
        System.out.println("Is it empty: "+CHarr.isEmpty());





    }
}
