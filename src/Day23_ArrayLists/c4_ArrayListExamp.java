package Day23_ArrayLists;

import java.util.ArrayList;

public class c4_ArrayListExamp {
    // write a method where it takes arraylist of Strings as input parameters and returns and Arraylist where
    // all the duplicates are removed;

    public static ArrayList<String> Name(ArrayList<String> arr){

        for (int i = 0; i < arr.size(); i++) {

            String nam = arr.get(i);// i = 0 nam = Sarp
            arr.remove(nam); // remove the

            if(arr.indexOf(nam) == -1){ //

                arr.add(i,nam);

            }


        }
        return arr;

    }

    public static void main(String[] args) {

        ArrayList<String> STnames = new ArrayList<>();

        STnames.add("Ziya");
        STnames.add("Sam");
        STnames.add("Ziya");
        STnames.add("Sevgi");
        STnames.add("Huseyin");
        STnames.add("Ziya");
        // STnames = [Ziya,Sam, Ozan,Sevgi,Huseyin,Ziya]
        System.out.println(Name(STnames));


    }
}
