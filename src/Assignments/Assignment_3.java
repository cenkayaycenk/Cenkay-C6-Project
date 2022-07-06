package Assignments;

public class Assignment_3 {
    public static void main(String[] args) {

            /*
       Coding Alexa for Weather [multiple Conditions]

       New graduate RenasTech students want to improve Alexa, and they will add weather functionality;
       Please help students with the assignment below.
              -Ask the user what's temperature is Fahrenheit;
              -Convert the value to Celsius formula :  C = F-32 / 1.80
       if temperature is  -10 or below  ==> print it's too cold
       if temperature is between -10 and 0 ==> print  it's cold
       if temperature is between 0 and 15 ==> print it's not cold
       if temperature is between 15 and 40 ==>print it's warm
       if temperature is 40 and 60 ===> print it's extremely hot!!
       if temperature is above 60 ==> print hot as hell
       Data to test: -40 F , 5F , 50f, 82, 130F, 400F
            */

        float fah = 100 ;

        float cel= (fah-32)/1.8f;

        if(cel <= -10){System.out.println("Temperature is " + cel +" ℃" + " ==>"+" It's too cold");}
        if(cel > -10 && cel <= 0 ){System.out.println("Temperature is " + cel +" ℃" + " ==>"+ " It's cold");}
        if(cel > 0 && cel <= 15){System.out.println("Temperature is " + cel +" ℃" + " ==>"+ " It's not cold");}
        if(cel > 15 && cel <= 40){System.out.println("Temperature is " + cel +" ℃" + " ==>"+ " It's warm");}
        if(cel > 40 && cel <= 60){System.out.println("Temperature is " + cel +" ℃" + " ==>"+ " It's extremely hot !!");}
        if(cel > 60){System.out.println("Temperature is " + cel +" ℃" + " ==>"+ " Hot as hell");}
    }
}
