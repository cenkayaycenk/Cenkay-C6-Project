package Day17_ArrayCont2;

import java.util.Arrays;

public class c6_ReverseArrayinPlace {
    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,8,9,0,-12};



        // Our goal is to get arr = {-12,0,9,8,7,6,5,4,3} 10/2= 5 ==>4

        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i]; // {3,4,5,6,7,8,9,0,-12}
            arr[i] = arr[arr.length-1-i]; // {-12,4,5,6,7,8,9,0,-12}// {-12,0,5,6,7,8,9,0,3} temp = 4
            arr[arr.length-1-i] = temp; // {-12,4,5,6,7,8,9,0,3} // {-12,0,5,6,7,8,9,4,3} // {-12,0,9,6,7,8,5,4,3}
            // {-12,0,9,8,7,8,5,4,3} // {-12,0,9,8,7,6,5,4,3}

        }

        System.out.println("The reverse arr: "+ Arrays.toString(arr));

    }
}
