package StudyHalls.Week1;

public class Session3 {

    public static void main(String[] args) {

        //Logical Operators
        // &&  => And
        //  ||  => OR
        // !   => not

        // Relational Operators
        //  ==  equals   5==3
        boolean b1= 5 ==3;
        System.out.println("b1 = " + b1); //b1 = false

        // != not equals , returns true or false

        boolean b2= 10 !=5;
        System.out.println("b2 = " + b2); //b2 = true

        // >
        // >=
        // <
        // <=

        // IF , ELSE , ELSE IF

        /**
         *
         *  if(condition){
         *   the block of the code to be executed if condition is true.
         *
         *
         *   }
         */

        String weather="Rainy";

        // if weather is Sunny ,
        if (weather=="Sunny"){
            //Rainy

            System.out.println("I will meet with you.");
            System.out.println("We can go to eat");
            System.out.println("we can go to the cinema");
        }

        System.out.println("Hello HELLO");


        int age=24;

        boolean hasMoney=true;

        System.out.println("Welcome to the Liquor Store");
        if (age >=21 && hasMoney){
            //true  && true >> true

            System.out.println("Enjoy your Wine ");
        }

        System.out.println("Case 2 ");

        age=20;
        hasMoney=false;

        //   20 >=21
        if (age >=21 && hasMoney){
            //  false && false
            System.out.println("Enjoy your Wine ");

        }

        //if else.

        System.out.println("Case 3");

        int age2= 21;

        if (age2 >22){
            // 21 > 22
            System.out.println("Enjoy your drink");
        }else{
            System.out.println("You are not eligiable to buy drink");
        }


        System.out.println("*******************");

        System.out.println("*******************");
        System.out.println("*******************");
        System.out.println("Tip Calculator App");
        /**
         * // Tip Calculator  [if-else]
         *
         * Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
         * // Condition1 >>> In his country, it's usual to tip 15% if the bill value is between 99 and 280.
         * // Condition2 >>> If the value is different, the tip is 20%.
         *
         * Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
         *
         * Example: "The bill was 275, the tip was 41.25, and the total value 316.25
         *
         * Data to test 97 ,100, 275 , 25
         */


        double bill =0.00; //

        double tipRate=0;
        double tip=0;
        double finalBill=0;

        // if the bill value is between 99 and 280.
        if (bill >=99 && bill<280){
            // case bill =100 >> 100 >=99 && 100 <280
            //  true && true >> true

            //case bill =20: 20>=99 && 20<280
            //               false && true  >> false

            // it's usual to tip 15%
            tipRate=0.15; // %15 .

            tip= bill * tipRate; // tip = %15 of the bill

            finalBill= bill + tip;

            System.out.println("bill = " + bill);
            System.out.println("tipRate = " + tipRate);
            System.out.println("tip = " + tip);
            System.out.println("finalBill = " + finalBill);


        }else {//// Condition2 >>> If the value is different, the tip is 20%.
            //the tip is 20%.
            tipRate=0.20;

            tip =bill * tipRate; // 20 * 0.20 ==4

            finalBill= bill +tip; // 20 +4

            System.out.println("bill = " + bill);
            System.out.println("tipRate = " + tipRate);
            System.out.println("tip = " + tip);
            System.out.println("finalBill = " + finalBill);

        }

        System.out.println("End of the code");






        if(false)
        {

        } else if (false) {

        }
        System.out.println("1");


    }
}
