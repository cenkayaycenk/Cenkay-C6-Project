package Day17_ArrayCont2;

import java.util.Arrays;

public class c4_ArrayStringCharMethod {
    public static void main(String[] args) {
        // String name = "ZiyaYilmaz"
        // name.toCharArray() --> this will get all the chars int to char [] (array)

        String name1 = "KubraGulay";
        char [] Chararr = name1.toCharArray(); // this will get all the chars in the name1 string
        // and put in Chararr array as characters (char)
        System.out.println("The Char array is : "+ Arrays.toString(Chararr));

        System.out.println("+++++++++++++++++++++++++++++++");

        String name2 = "Bahar + Rachel";

        char [] CharArr2 = name2.toCharArray();
        System.out.println("This is the second array: "+Arrays.toString(CharArr2));




    }
}
