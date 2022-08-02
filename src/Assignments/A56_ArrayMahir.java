package Assignments;

import java.util.Arrays;

public class A56_ArrayMahir {
    //   Interview questions
    //   (Array) Find Maximum
    //   Write a program that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[] arr = {12, 56, 54, 98, -45, 1, 27};
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMaximum number in the Array is : " + max);
        System.out.println("Minimum number in the Array is : " + min);
    }
}
