package A75_ClassesHW35;

public class CarClassHW35 {
    /*
    Write a Car Class where it has following attributes:
1) Model
2) Year
3) Speed
and following method:
1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
2) PrintCar() - Where it prints each objects attributes
3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount

Create 4 instance of Car Class, after Setting the Attribute values,
Apply increaseSpeed and DecreaseSpeed Multiple times for different values.
For those which has speed of 80 or more,
Print warning such as "Car "Model" and"Speed" is danger of getting ticket"
     */

    String Model;
    int Year;
    double Speed;

    public void setInfo(String CarBrand, int CarYear, double CarSpeed){
        Model=CarBrand;Year=CarYear;Speed=CarSpeed;
    }
    public void PrintCar(){
        System.out.println("Car Model is :"+Model+"\nCar Year is :"+Year+"\nCar Speed is :"+Speed);
    }
    public void increaseSpeed(double increase){
        Speed+=increase;
    }
    public void decreaseSpeed(double decrease){
        Speed-=decrease;
    }
}
