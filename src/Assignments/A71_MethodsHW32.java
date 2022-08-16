package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A71_MethodsHW32 {
    /*
    Write methods where it takes the ArrayList of Double
1) first method returns to max number
2) second method returns to min number
3) third Method prints all element one by one on the same line
( ex = the List is: 100.9, 12.45, 30.46 )
     */
    public static void main(String[] args) {

        ArrayList<Double> numberlist = new ArrayList<>();
        numberlist.addAll(Arrays.asList(20.5, 14.3, 85.4, 5.4, 102.9, 45.1));

        System.out.println("Maximum number is: " + maxNumber(numberlist));
        System.out.println("Minimum number is: " + minNumber(numberlist));
        allNumbers(numberlist);
    }

    public static double maxNumber(ArrayList<Double> arr1) {

        double max = Collections.max(arr1);
        return max;
    }
    public static double minNumber(ArrayList<Double> arr1) {

        double min = Collections.min(arr1);
        return min;
    }
    public static void allNumbers(ArrayList<Double> arr1) {
        System.out.print("The Number list is: ");
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + ", ");
        }

    }

}
