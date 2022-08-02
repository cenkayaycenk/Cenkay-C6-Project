package Practice_Array;

import java.util.Arrays;

public class MinNumberArray {
    /*Write a code with following requirements:
      Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
      Print the minimum number in the given array*/

    public static void main(String[] args) {

        int [] numbers={6,7,2,3,90,-2,-90,-122,96,35};
        int min=numbers[0];
        System.out.println(Arrays.toString(numbers));

        for (int i=0; i< numbers.length; i++){
            if (min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("The Minimum number is :  " + min);
      

    }



}
