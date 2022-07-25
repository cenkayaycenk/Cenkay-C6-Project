package Day14_NestedLoops;

public class c2_Example {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            System.out.println("From the Outer Loop==> I value: " +i); // 5

            for (int j = 1; j <=5 ; j++) {

                System.out.println("        From the Inner Loop ==> J value: "+j); // 25

                for (int k = 1; k <=5; k++) {

                    System.out.println("                        From the Inner Inner Loop ==> K value: "+k); // 125

                }

            }


        }

    }
}
