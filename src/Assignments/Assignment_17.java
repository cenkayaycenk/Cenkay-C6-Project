package Assignments;

public class Assignment_17 {
    public static void main(String[] args) {
        /**
         * Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula:
         * BMI = mass / (height * height) (mass in kg and height in meter).
         *
         * Test data:
         * ** Data 1: Marks weights 78 kg and is 1.69 m tall. John weights 92 kg and is 1.95 m tall.
         *
         * Requirements:
         * 1- Create variables for Mark and John.
         * 2- Calculate Mark's and Jonh's BMI as a variable
         * 3- Print who has more BMS using if else statement
         * 4- Repaet same steps for new data (New data sample is in Below)
         *
         * **Data 2: Marks weights 95 kg and is 1.88 m tall. John weights 85 kg and is 1.76 m tall.
         */

        double MarkHt=188;    double JohnHt=176;
        double MarkWt=95;    double JohnWt=85;
        double MarkBmi=MarkWt/(MarkHt*MarkHt);   double JohnBmi=JohnWt/(JohnHt*JohnHt);
        String result="";

        if (MarkBmi>JohnBmi){
            result="Mark's BMI is : "+MarkBmi+"\nJohn's BMI is : "+JohnBmi+
                    "\nMark's BMI is more then John's BMI";
        }else if(JohnBmi>MarkBmi){
            result="John's BMI is : "+JohnBmi+"\nMark's BMI is : "+MarkBmi+
                    "\nJohn's BMI is more then Mark's BMI";
        }else {
            result="John's BMI is : "+JohnBmi+"\nMark's BMI is : "+MarkBmi+
                    "\nTheir BMI 's are equal ";
        }
        System.out.println(result);
    }
}
