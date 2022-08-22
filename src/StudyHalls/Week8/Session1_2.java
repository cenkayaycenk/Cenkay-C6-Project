package StudyHalls.Week8;

import static StudyHalls.Week8.Utils.MakeLines;
import static StudyHalls.Week8.Utils.sayHello;

public class Session1_2 {
    public static void main(String[] args) {


        MakeLines();

        int [] arr1={0,-90,100,10,5};

        System.out.println(Utils.maxNumber(arr1));

       int maxValue= Utils.whichIsMax(400,100);

        System.out.println("maxValue = " + maxValue);

        System.out.println(Utils.whichIsMax(4, -90));

        sayHello();

        //Overloading.

        Utils.sum(3,2);
        Utils.sum(2,3,4);
        Utils.sum(3,10.0);
        Utils.sum(5,"Renatech");




    }
}
