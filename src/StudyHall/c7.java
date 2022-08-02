package StudyHall;

public class c7 {
    public static void main(String[] args) {

        //For
        //  System.out.println(1);
        //   System.out.println(2);
        //  System.out.println(2);
        ///

      /*  String a="Reastech";
        System.out.println(a);
        System.out.println(a);
        for(startingP; EndingPoint ; iteration){
            // states of the codes.
        };
       */


        for(int a =0; a<11; a++){

            System.out.println(a);
        }

        //I want to print Renastech 5 times;

        for (int i=10; i<15 ; i++){
            System.out.println("Renastech");
        }

        System.out.println("*******************");

        //// write a program that will print numbers from 15 to 5 as ascending. Please use for loop
        //Expected output: 15 14 13 12 11 10 9 8 7 6 5

        for (int j= 15; j>=5; j--){

            System.out.print(j+" ");
        }

        System.out.println("  ");
        System.out.println("*******************");


        //Write a code where user is asked to enter an integer number:
        // 1) Using the given number find the factorial of that number and Print the result.
        //example: 5 ==> 5! = 5*4*3*2*1 = 120

        int a=5; // factorial : 4 * 3 * 2 * 1= 24.
        int b= 3; // factorial : 3 * 2 *1 = 6

        //fori

        int factorialValue=1;  // we will store our answer in the this variables.


        //a
        for (int i = 1; i <=a ; i++) {

            // i=1      1<=5 ; i++
            // i=2      2<=5  i++
            //i=3       3<=5   i++
            // i=4      4<=5   i++
            // i=5     5<=5    i++
            //i =6     6<=5

            factorialValue =factorialValue *i;
            //  =         = 1 * 1 >> 1
            //             = 1 *2 >> 2
            //             = 2 * 3 >> 6
            //             = 6 * 4 >> 24
            //             = 24 *5 >> 120


        }

        System.out.println("factorialValue = " + factorialValue); //factorialValue = 24

        System.out.println("****************");
        ////Write   a   program   that   will   count   how   many   times   "a"   is   found   in   any   given   String:
        ////String mystring="java is fun, but sometimes java is just pain.Love java java java";

        String str= "java is fun, but sometimes java is just pain.Love java java java"; // a
        //           0123 >> for loop
        // charAt >> to check specific index

        // we want to count how many times a is found.
        int count=0;
        //                       4
        for (int i = 0; i < str.length(); i++) {
            //   i=0    0<4              i++ >> j
            //i=1       1<4             i++ >> a
            //i=2       2<4             i++ > v
            //i =3      3<4            i++   a
            //i =4     4<4

            if (str.charAt(i)=='a'){ // j== a  ,, a==a , v==a , a==a

                count++; //0++ >> 1
                //         1++
            }

        }

        System.out.println("count = " + count);


    }
}

