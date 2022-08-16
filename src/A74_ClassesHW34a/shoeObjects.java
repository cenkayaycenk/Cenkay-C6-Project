package A74_ClassesHW34a;

import My_Util.breaking;

import java.util.ArrayList;
import java.util.Arrays;

public class shoeObjects {

    public static void main(String[] args) {

        shoe shoe1 = new shoe();shoe1.SetInfo("Nike", 10, "Basketball", 100);
        shoe shoe2 = new shoe();shoe2.SetInfo("SKecHers", 7.5, "Running", 80);
        shoe shoe3 = new shoe();shoe3.SetInfo("Adidas", 8, "Basketball", 45);
        shoe shoe4 = new shoe();shoe4.SetInfo("Puma", 11, "Tracking", 120);

        ArrayList<shoe> shoeList = new ArrayList<>();
        shoeList.addAll(Arrays.asList(shoe1, shoe2, shoe3, shoe4));

        for (int i = 0; i < shoeList.size(); i++) {
            if (shoeList.get(i).price > 10.00) {
               shoeList.get(i).Print();
               breaking.Lines();
            }
            if (shoeList.get(i).price >= 50.00) {
                System.out.println("You have "+shoeList.get(i).price * 0.15+" discount for this order");
                shoeList.get(i).price = shoeList.get(i).price * 0.85;
                System.out.println("After Discount: "  + " : " + "Last Price of "+shoeList.get(i).brand+
            " is : "+shoeList.get(i).price);
                breaking.Lines();
            }


        }
    }
}
