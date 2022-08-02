package Practice_Array;

import java.util.Arrays;

public class DividedValueArray {
    /*
    write a code with following requirements
    define an array with following values {90,34,23,87,45,36,98}
    Print the values that can be divided by 2 or 3
     */
    public static void main(String[] args) {


        int[] numbers = {90, 34, 23, 87, 45, 36, 98};
        System.out.println(Arrays.toString(numbers));

        int numDiv = numbers[0];
        System.out.println("Numbers can be divided by 2 or 3 : ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0) {
                numDiv = numbers[i];

                System.out.print(numDiv + " ");
            }
        }

    }
}