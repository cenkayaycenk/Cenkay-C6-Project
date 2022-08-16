package Day25_ClassesAndObjects;

public class CarObjects {
    public static void main(String[] args) {


        CarClass car1 = new CarClass();
        car1.setStringValues("Toyota","Camrt","Grey");
        car1.setYear(2020);
        car1.Miles=190.89;

        System.out.println("The Car Object:: "+car1.toString());
    }
}