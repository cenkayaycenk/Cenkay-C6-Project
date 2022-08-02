package Day17_ArrayCont2;

import java.util.Arrays;

public class c3_StringMethodsinArray {
    public static void main(String[] args) {

        // string.split() this is a String Method, you can not use it for numbers or other data types.
        String s = "Ziya is instructor";

        String [] name= s.split(" "); // This method will get every substring starting from beginning until it
        // sees the char added in the qo utes
        // you can not use "?", "+","*"

        System.out.println("the array is: "+ Arrays.toString(name));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        String ja = "Java is cool";
        String [] name2 = ja.split(""); // It will get every chars in the substring but theated as string not Chars
        System.out.println("The Other array is: "+ Arrays.toString(name2));



    }
}
