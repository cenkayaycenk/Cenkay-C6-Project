package Assignments;

import java.util.Arrays;

public class A46_ArrayHW12 {
    // Write   a   Java   program   to
    // reverse   the   element   of   an   integer    array.
    public static void main(String[] args) {

        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        System.out.println("Reversed of Array: ");

        for(int i=arr.length-1;i>=0;i--)

            System.out.print(arr[i] + "  ");



    }

}
