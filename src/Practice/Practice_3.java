package Practice;

public class Practice_3 {

    // Water Temp is 100 it is boiling
    // Water Temp is 0 it is freezing
    // Watter temp is 0<temp<10 So Cold
    // Water temp between 10-30 will cold
    // Water tem 60-90 Hot
    // Water Temp 90<temp<100 So Hot,
    // rest Room Temp

    public static void main(String[] args) {

        int temp= 45;
        String result= "";

        result =(temp>100)? " is boiling":
                (temp==0)? " is freezing":
                        (temp>0 && temp<10)? " is so cold":
                                (temp>10 && temp<30)? " will cold":
                                        (temp>60 && temp<90)? " is Hot":
                                                " is Room Temperature";
        System.out.println("Water Temperature" + result);



    }
}
