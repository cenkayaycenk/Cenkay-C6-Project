package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_5 {
    public static void main(String[] args) {

    int [] numbers= {5,25,45,12,105,65,82,90};

       // Write a Java program to get the difference between the
        // largest and smallest values in an array of integers.

        Arrays.sort(numbers);

    int result=0;

    result= numbers[numbers.length-1]-numbers[0];
        System.out.println(result);








    }
}
