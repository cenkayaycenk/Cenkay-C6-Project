package A75_ClassesHW35;

import My_Util.breaking;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjectsHW35 {

    public static void main(String[] args) {
        CarClassHW35 car1=new CarClassHW35();car1.setInfo("Honda",2014,88);
        CarClassHW35 car2=new CarClassHW35();car2.setInfo("Toyota",2018,75);
        CarClassHW35 car3=new CarClassHW35();car3.setInfo("Ford",2020,105);
        CarClassHW35 car4=new CarClassHW35();car4.setInfo("GMC",2021,90);

        ArrayList<CarClassHW35> CarList=new ArrayList<>();
        CarList.addAll(Arrays.asList(car1,car2,car3,car4));

        for (int i = 0; i < CarList.size(); i++) {
            CarList.get(i).PrintCar();
            if (CarList.get(i).Speed >= 80) {
                System.out.println("Warning !!!"+"\nYour Speed is above the legal limit"
                        +"\nDanger of Getting ticket");
            } else {
                System.out.println("Your Speed is below the legal limit");
            }
            System.out.println();
            breaking.Lines();
            continue;
        }
    }
}
