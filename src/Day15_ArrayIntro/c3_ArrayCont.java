package Day15_ArrayIntro;

public class c3_ArrayCont {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22};
        System.out.println("the first number is: " + nums[0]);

        nums[0] = 11; // this will reassign the index 0 (value of 1) to (value of 11)

        System.out.println("the first number is: " + nums[0]);

        // If I want to init a anrray but assign the values later,
        // int [] name = new int[size]

        //int [] numbers = new int[10]; // java will create an array that has the deafult values for each index

        // for the numbers the default values are 0, (int, byte, long) 0.0( float, double)

        int[] numbers = new int[12]; // {0,0,0,0,0,0,0,0,0,0}
        float[] flnums = new float[10]; // {0.0,0.0,0.0.....}

        // for string
        String[] St = new String[3]; // {null,null,null} // default values for String is null
        char[] CH = new char[4]; // { , , , }

        System.out.println("Default value is : " + numbers[0]);
        System.out.println("Default value for float : " + flnums[0]);
        System.out.println("Default value for String : " + St[0]);
        System.out.println("Default value for Chars : " + CH[0]);

        boolean[] Bool = new boolean[4];// For boolean default value is false

        System.out.println("The Default value for boolean is: " + Bool[3]);


    }
}
