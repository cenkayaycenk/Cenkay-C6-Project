package Practice_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class p14 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(65);
        numbers.add(78);
        numbers.add(-15);
        numbers.add(54);
        numbers.add(61);
        numbers.add(34);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);

        for(Integer reverse:numbers){
            System.out.println(reverse);
        }


    }
}
