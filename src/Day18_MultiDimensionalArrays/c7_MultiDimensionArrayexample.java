package Day18_MultiDimensionalArrays;

public class c7_MultiDimensionArrayexample {
    public static void main(String[] args) {

        String [][] name2D = {{"AM","PM","ST"},{"CF","KT"},{"WE","NS"},{"DC","TN","NJ","MD"}};

        System.out.println("The KT: "+name2D[1][1]);
        System.out.println("The size of index 0 array inside of array is: "+name2D[0].length);

        System.out.println("The size of index 3 array inside of array is: "+name2D[3].length);

    }
}
