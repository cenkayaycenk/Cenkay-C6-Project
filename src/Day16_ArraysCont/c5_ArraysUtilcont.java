package Day16_ArraysCont;

import java.util.Arrays;

public class c5_ArraysUtilcont {
    public static void main(String[] args) {
        // Array.sort(array)
        // the sort will be in increasing order

        int [] srt = {90,45,34,-90,-1000,400};

        Arrays.sort(srt);

        for (int i = 0; i < srt.length; i++) {

            System.out.println(srt[i]);

        }

        System.out.println("++++++++++++++++++++++++++++++++===");

        System.out.println(Arrays.toString(srt));

        System.out.println("++++++++++++++++++");

        int [] srt2 ={78,34,5,-230,67};

        Arrays.sort(srt2);

        //System.out.println(Arrays.sort(srt2)); Arrays.sort(arrayname) will get teh array and sort it
        // assign  back to same  array
        System.out.println(Arrays.toString(srt2));

        System.out.println("+++++++++++++++++++++++++++++=");

        String [] str3 = {"Cevdet","Sam","Ziya","Bahar"};

        Arrays.sort(str3);

        System.out.println(Arrays.toString(str3));

    }
}
