package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class A73_MethodsHW34 {
    /*
    Write a method where it takes ArrayList of Strings  and the index,
    returns to the element of that index in the ArrayList
     */


    public static String MethodIndex(ArrayList<String> arr, int index){
        return arr.get(index);
    }
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        teams.addAll(Arrays.asList("Fenerbahce","Galatasaray","Besiktas"));
        System.out.println(MethodIndex(teams, 0));
    }
}
