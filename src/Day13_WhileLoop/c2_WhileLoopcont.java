package Day13_WhileLoop;

public class c2_WhileLoopcont {
    public static void main(String[] args) {

        int i =0;
        while(i<10){
            // i++; // this will increase the i value before running the code below
            System.out.println("The i values: "+i);
            i++; // it is important to know when to increase the i value

        }
        System.out.println("===========================");
        int j = 0;
        while(j<=10){ // j =0
            //j = j+2; // j =2
            if(j==8){
                j=j+2;
                continue;
            }
            System.out.println("the even numbers " +j);
            j=j+2;

        }
        System.out.println("=======================");
        int k = 0;
        while(k<=10){
            //System.out.println("The k value: " +k);// 0,1,2,3,4,5,6,7,8,9
            if(k==9){
                break;
            }
            System.out.println("The k value: " +k); // 0,1,2,3,4,5,6,7,8
            k++; //k = k+1;

        }

    }
}
