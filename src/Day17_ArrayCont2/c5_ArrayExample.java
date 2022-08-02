package Day17_ArrayCont2;

import java.util.Arrays;

public class c5_ArrayExample {
    public static void main(String[] args) {
        // write a code where it will get all the words in a string and put in to an array then lets reverse the words

        String ex = "Tracy is cool";
        String [] exArr= ex.split(" "); // 3 {Tracy, is, Cool}
        // index of the values        0 ,   1,  2

        System.out.println("The array: "+ Arrays.toString(exArr));

        // {cool,is,Tracy}
        String [] reverse = new String[exArr.length]; // reverse ={null,null,null}

        int k = 0;
        for (int i = exArr.length-1; i >=0; i--) {

            reverse[k] = exArr[i];
            k++;

        }

        System.out.println("the reverse of array is: "+Arrays.toString(reverse));

        System.out.println("the Original Array is: "+Arrays.toString(exArr));

        String reverst= "";

        for (int i = 0; i < reverse.length; i++) {

            reverst = reverst+ reverse[i]+" ";

        }

        System.out.println("The reverse String is: "+reverst);

        reverst = reverst.trim();

        System.out.println("The reverse String is: "+reverst);



    }
}
