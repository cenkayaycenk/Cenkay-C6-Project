package Practice_Array;

import java.util.Arrays;

public class IndexOfElement {
    public static void main(String[] args) {

        // Find Index of Element in Array
        int[] numbers = {4, 9, 7, 3, 2, 12, 11, 85, 8};
        System.out.println("Numbers = " + Arrays.toString(numbers));

        int element = 85;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                index = i;
            }
        }
        System.out.println("Index of " + element + " is  = " + index);

    }
}
