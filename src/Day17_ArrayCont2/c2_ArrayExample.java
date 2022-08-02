package Day17_ArrayCont2;

import java.util.Arrays;

public class c2_ArrayExample {
    public static void main(String[] args) {
        // Adding 2 arrays into one
        int[] arr1 = {2, 3, 4, 5}; // put arr1 in to arr3 first
        int[] arr2 = {3, 4, 5, 6, 7}; // then put arr2 in the arr3

        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < size; i++) {
            arr3[i] = arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}