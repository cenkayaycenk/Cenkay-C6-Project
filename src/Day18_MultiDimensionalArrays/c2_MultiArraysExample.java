package Day18_MultiDimensionalArrays;

public class c2_MultiArraysExample {
    public static void main(String[] args) {

        String [][] Stnames = {{"Bahar","Gulay"},{"Ziya"},{"Raz","Kubra","Sarp"},{"Sam","Airevan"}};  // the size of first array is 4
        // In order for me to get "Airevam"  Stnames[3][1]

        System.out.println("Get Airevan in index of [3][1]: "+Stnames[3][1]);

        int [] one = new int[3]; // {0,0,0}

        int [][] two = new int[3][3]; // {{0,0,0},{0,0,0},{0,0,0}} // it will fill with the default values
        System.out.println("The last element in the array: "+two[2][2]);

        // replace initial values with number 5;

        // {{5,5,5},{5,5,5},{5,5,5}}

        for (int i = 0; i < two.length; i++) {

            for (int j = 0; j < two[0].length; j++) {// two[0], two[1] and two[2] has the same size so I can use any of them

                two[i][j] = two[i][j] + 5;// {{5,5,5},{5,5,5},{5,5,5}}

            }



        }
        for (int i = 0; i < two.length; i++) {

            for (int j = 0; j < two[0].length; j++) {// two[0], two[1] and two[2] has the same size so I can use any of them

                System.out.println("The i index: "+i+" The j index "+j+ " the value: "+two[i][j]);

            }



        }



    }
}
