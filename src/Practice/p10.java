package Practice;

import java.util.Arrays;

public class p10 {

    //Shifted array
    public static void main(String[] args) {

        int [] arr={3,4,5,6,7,8,9};
        // expected output {4,5,6,7,8,9,3}

        int temp=arr[0]; // temp=3

        for (int i = 1; i < arr.length ; i++) {
            arr[i-1]=arr[i];
            System.out.println(Arrays.toString(arr));

        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));


    }
}
