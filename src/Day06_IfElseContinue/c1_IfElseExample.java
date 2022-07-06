package Day06_IfElseContinue;

public class c1_IfElseExample {
    public static void main(String[] args) {


            // Water Temp is 100 it is boiling
            // Water Temp is 0 it is freezing
            // Watter temp is 0<temp<10 So Cold
            // Water temp between 10-30 will cold
            // Water tem 60-90 Hot
            // Water Temp 90<temp<100 So Hot,
            // rest Room Temp

            String WaterCond;
            int temp = 0;

            // Water Temp is 100 it is boiling
            if(temp == 100){

                WaterCond = "Boiling";
                System.out.println("The Water condition is: "+WaterCond);
            }
            else if(temp == 0){ // Water Temp is 0 it is freezing
                WaterCond = "Freezing";
                System.out.println("The Water condition is: "+WaterCond);
            }
            else if(temp>0 && temp<10){ // Watter temp is 0<temp<10 So Cold
                WaterCond = "So Cold";
                System.out.println("The Water condition is: "+WaterCond);
            }
            else if (temp>=10 && temp<30){ // Water temp between 10-30 will cold

                WaterCond = "Cold";
                System.out.println("The Water condition is: "+WaterCond);

            }
            else if(temp>=60 && temp<90){ // Water tem 60-90 Hot

                WaterCond = "Hot";
                System.out.println("The Water condition is: "+WaterCond);

            }

            else if(temp>=90 && temp<100){

                WaterCond = "So Hot";

                System.out.println("The Water condition is: "+WaterCond);

            }
            else { // rest Room Temp
                WaterCond = "Room Temp";
                System.out.println("The Water condition is: "+WaterCond);
            }



        }

    }

