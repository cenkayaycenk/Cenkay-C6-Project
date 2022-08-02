package Assignments;

import java.util.Arrays;

public class A57_ArrayMahir {
    //    (Array) Move Zeros to the End
    //    Write a program that can move all the zeros to the last indexes of the array (Do Not Use Sort Method)
    //    Ex:
    //    input:  [1,0,2,0,3,0,4,0];
    //    output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == 0) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
