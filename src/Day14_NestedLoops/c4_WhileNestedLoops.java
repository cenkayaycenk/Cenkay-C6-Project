package Day14_NestedLoops;

public class c4_WhileNestedLoops {
    public static void main(String[] args) {
        int i = 0;
        //int j;

        while(i<2){

            System.out.println("From the outer loop i value: " +i);

            int j = 0;

            // i++; // this will increase the k value before the code block are executed
            while(j<2){
                System.out.println("       From Inner Loop j Value: " +j);
                j++;
                int sum = j+i;
            }
            i++; // this will increase the k value after the code block are executed
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        int k = 0;
        while(k<3){

            System.out.println("From the wile loop, Outer Loop the k value: " +k);

            for(int l = 0; l<3;l++){
                System.out.println("                From inner For Loop l value: "+l);
            }
            k++; // this will increase the k value after the code block are executed
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        for (int j = 0; j < 3; j++) {
            System.out.println("However:   from for loop");
            int f =0;
            while(f<2){
                System.out.println("                whatever:  While Loop     ");
                f++;
            }

        }


    }
}
