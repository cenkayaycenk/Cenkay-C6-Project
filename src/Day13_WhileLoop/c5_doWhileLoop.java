package Day13_WhileLoop;

public class c5_doWhileLoop {
    // The Concept do while Loop is
    // do{
    // code block
    //}while(condition);

    public static void main(String[] args) {
        int i = 30;
        do{
            System.out.println("The i Value: " +i);
            i++;
        }while(i<10);

       /* int j = 0;
        while(j<10){
            j++;
        */
        //}

        System.out.println("+++++++++++++++++++++++++++++++++");
        int j = 9;
        do{
            if(j<10){
                System.out.println("The i Value: " +j);
                j++;
            }

        }while(j<10);
    }
}
