package Day12_BreakStatement;

public class c3_ContStatement {
    // If you run your code and it contains cont it will pass that iteration int for loop

    public static void main(String[] args) {

        // I want to print all the numbers between 0 to 10(not included) except number 3,6,9
        for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9,10

            System.out.println("Before Cont: " +i); // 1,2,,3,4,5,6,7,8,9

            // System.out.println(i);
            if(i ==3 || i == 6 || i ==9 ){
                continue;
            }

            System.out.println("After Cont : " +i); // 1,2,4,5,7,8
        }
    }
}
