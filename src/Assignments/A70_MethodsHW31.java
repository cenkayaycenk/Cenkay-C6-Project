package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class A70_MethodsHW31 {
    /*
    Write a Method where it takes an Integer of ArrayList
    and returns to an Integer ArrayList where it contains only unique numbers
       ex:   list==>   {1,1,2,3,3,4,5,6}
      uniques   ==>   {2,4,5,6}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6));
        System.out.println("list = " + list);
        list.removeAll(Arrays.asList(1, 3));
        System.out.println("uniques = " + list);


    }
}