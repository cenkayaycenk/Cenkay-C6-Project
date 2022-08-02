package Practice;

import java.util.Arrays;

public class p9 {
    //reversed array
    public static void main(String[] args) {


        int[] arr = {3, 4, 5, 6};
        //   System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

            //   System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}