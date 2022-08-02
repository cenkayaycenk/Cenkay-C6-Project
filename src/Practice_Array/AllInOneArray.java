package Practice_Array;

import java.util.Arrays;

public class AllInOneArray {
    // Program to Calculate Sum,Average,min number,max numbers,numbers divided by 2 and 3 Using Arrays
    // {12,54,65,87,63,84,18}
    public static void main(String[] args) {

        int[] numbers = {12, 54, 65, 87, 63, 84, 18, -54, -86};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        System.out.println("Numbers : " + Arrays.toString(numbers));
        System.out.println("------------");
        System.out.println("Size of the Array is : " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        double ave = sum / numbers.length;
        System.out.println("Sum of the numbers : " + sum);
        System.out.println("Average of the numbers : " + ave);


        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max number is : " + max);

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Min number is :" + min);

        int div2and3 = numbers[0];
        System.out.println("The numbers can be divided by 2 and 3");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] % 3 == 0) {
                div2and3 = numbers[i];
                System.out.print(div2and3 + " ");

            }
        }
    }


}


