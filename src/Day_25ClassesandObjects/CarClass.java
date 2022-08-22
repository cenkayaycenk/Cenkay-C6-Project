package Day_25ClassesandObjects;

public class CarClass {

    String Brand;
    String Model;
    int Year;
    String Color;
    double Miles;

    public void setStringValues(String brnd,String mdl,String clr){
        Brand = brnd;
        Model = mdl;
        Color = clr;



    }


    public void setYear(int yr){
        Year = yr;
    }

    public String Print(){
        String car = "Brand: "+Brand + " Model: " +Model+ " Year: "+Year+" Miles: "+Miles;
        return car;
    }
}
