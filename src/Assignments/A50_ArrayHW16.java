package Assignments;

import java.util.Arrays;

public class A50_ArrayHW16 {
    //  Write a code where you sort all the integer values in an array in descending order
//  (Do not use the Arrays.sort() )
    public static void main(String[] args) {

        int[] numbers = {12, 27, 38, 567, 80, -8, -48};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}