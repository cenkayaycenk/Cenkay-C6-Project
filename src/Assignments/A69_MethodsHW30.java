package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class A69_MethodsHW30 {
    /*
    Write a method where it takes 2 String arrays and
    returns to an ArrayList where it contains all of the elements of the Arrays
arr1   =   {"A",   "B",   "C"};
arr2   =   {"D",   "E",   "F",   "G"};
ist   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}
     */

    public static ArrayList<String> AddTwoArray(String[] arr1, String[] arr2) {

        int size = arr1.length + arr2.length;
        ArrayList<String> TwoArrays = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            TwoArrays.add(i, arr1[i]);
        }
        int j = 0;
        for (int i = arr1.length; i < size; i++) {
            TwoArrays.add(TwoArrays.size(), arr2[j]);
            j++;
        }
        return TwoArrays;
    }

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        AddTwoArray(arr1, arr2);
        System.out.println(AddTwoArray(arr1, arr2));
    }
}
