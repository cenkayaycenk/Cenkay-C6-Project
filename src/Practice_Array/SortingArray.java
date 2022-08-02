package Practice_Array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        // program for Sorting the array

        int[] arr = {
                12, 58, 97, 54, 12, -45, -89, 65, -95, 25, 154, 21};


        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int num = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = num;
                i = -1;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

