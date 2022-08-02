package Day18_MultiDimensionalArrays;

public class c1_MultiArrays {
    public static void main(String[] args) {
        // Arrays having arrays as values or having multiple array nested inside each other

        // Datatype [] name = {........}
        // DataType [][] name = { {......},{........}}

        int [] normal = {1,2,3,4,5};
        int a = normal[3];

        int [][] name1={    {12,34,56,78},        {78,89,23,11}    };
        // The index outer array        0                       1
        // The index for inside array   0,1,2,3,             0,  1, 2, 3

        System.out.println("The number in the provided indexes is: "+name1[1][1]);

        int [][][] tr= {    {{5,5,6,7,3,7,},  {0,5,6,7,2,4}},      {{0,7,8,5,3,7},           {23,65,4874}},    {{0,54,67,89},{98,56,75}}};

        // The first array:                  0                                                  1                           2

    }
}
