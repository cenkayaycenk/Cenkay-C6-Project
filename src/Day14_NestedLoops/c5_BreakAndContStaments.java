package Day14_NestedLoops;

public class c5_BreakAndContStaments {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            System.out.println("From the Outer Loop i Value: "+i);

            for (int j = 0; j < 3; j++) {

                if(j == 2){
                    break;
                }
                System.out.println("             From the inner Loop J value: "+j);

            }

        }
        System.out.println("________________________________________-");
        for (int i = 0; i <=3; i++) {

            System.out.println("From the Outer Loop i Value: "+i);

            for (int j = 0; j < 4; j++) {

                if(i == 2){
                    continue;
                }
                System.out.println("             From the inner Loop J value: "+j);

            }
            int l = 0;
            while(l<4){
                if(i == 2){
                    l++;
                    continue;
                }

                System.out.println("             From the inner Loop l value: "+l);
                l++;
            }

        }
    }
}
