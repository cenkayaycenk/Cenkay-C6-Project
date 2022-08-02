package Assignments;

import java.util.Arrays;

public class A48_ArrayHW14 {
//    Write code where it shifts all the elements in array by one index
//    and put the the first index at the end of the array
//    example array = {2,3,4,5,6,7,8,9} ===>
//    shifted array = {3,4,5,6,7,8,9,2}

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Orginal Array"+"\n"+Arrays.toString(numbers));
        int temp = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i-1]=numbers[i];
            }
        numbers[numbers.length-1] = temp;
        System.out.println("Shifted Array"+"\n"+Arrays.toString(numbers));

        }


    }






