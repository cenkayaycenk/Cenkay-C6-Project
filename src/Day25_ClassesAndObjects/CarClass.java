package Day25_ClassesAndObjects;

import java.time.YearMonth;

public class CarClass {

    String Brand;
    String Model;
    int Year;
    String Color;
    double Miles;

    public void setStringValues(String brnd, String mdl, String clr){
        Brand= brnd;
        Model=mdl;
        Color=clr;
    }
    public void setYear(int yrs){
        Year=yrs;
    }
    public String toString(){
        String car= "Brand: "+Brand+" Model: "+Model+" Year: "+Year+" Miles: "+Miles;
        return car;
    }


    public void setInfo() {
    }
}
