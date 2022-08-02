package Assignments;

import java.util.Arrays;

public class A55_ArrayMahir {
    public static void main(String[] args) {
        //    Interview question
        //    (Array) Concat two arrays
        //    Write a program that can concate two arrays

        int[] arr1 = {26, 32, 45, 57};
        int[] arr2 = {32, 42, 53, 69, 73};
        System.out.println("First Array is : " + Arrays.toString(arr1));
        System.out.println("Second Array is : " + Arrays.toString(arr2));

        int size = arr1.length + arr2.length;
        int[] conCate = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            conCate[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < size; i++) {
            conCate[i] = arr2[j];
            j++;
        }
        System.out.println("Concate Array is : " + Arrays.toString(conCate));
    }
}
