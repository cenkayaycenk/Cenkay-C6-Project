package Assignments;

import java.util.Scanner;

public class A44_Distance {
    /*Write a code where it calculates the shortest distance from the starting point to the ending point
        1) User is entering the number of miles.
        2) Then the user enters the direction ("W" or "w"  for the west, "N" or "n" for North, "E" or "e" for East, "S" or "s" for South,
        (enter the number of the miles: 2)
        (Enter the direction: W)
        3) This will continue until the user is done entering the miles and directions(Check out the previous example: for instance "If you are done please enter 0")
        4) Find the shortest distance between Starting Point and the End Point with the direction,
        ( Hint: The hypotenuse theory, To find the square root of a number, you can use Math.sqrt(number)
        see the example on  the screenshot below)
        5) See the example below.
        6) Based on the Screenshot provided your output or answer should be  ( The Answer is: 4.472213 Miles NorthEast)
        7) If the endpoint and starting point are the same your output or the answer should be (The Answer is: You are at the Starting Point)
        8) You are only allowed to you the topics we have covered so far except Math.sqrt() // which is a Math method returns to the Square root of a number
        9) Please do it yourself. Do NOT as your developer or QA engineer friends. Be fair to everyone in the class. Ask on the Comments if you have any questions about the assignment (edited)

 */

        public static void main(String[] args) {

            int totalS = 0, totalN = 0, totalE = 0, totalW = 0, subS = 0, subN = 0, subE = 0, subW = 0;
            int mls = 0;
            int totalGen=0;
            float ppSub=0;
            String drc, cont, mlsS = "";
            String comm = "";
            Scanner sc = new Scanner(System.in);


            while (true) {
                System.out.println("Please Enter the number of the miles: ");
                mls = sc.nextInt();
                while (true) {
                    System.out.println("Please Enter the Direction: ");
                    drc = sc.next();
                    if (drc.toUpperCase().equals("S") || drc.toUpperCase().equals("N") || drc.toUpperCase().equals("E") || drc.toUpperCase().equals("W"))
                        break;
                    else System.out.println("Please Enter the Correct Direction");
                }
                System.out.println("If you are done please enter 0 or 1 to continue");
                cont = sc.next();
                switch (drc.toUpperCase()) {
                    case "S":
                        totalS += mls;
                        break;
                    case "N":
                        totalN += mls;
                        break;
                    case "E":
                        totalE += mls;
                        break;
                    case "W":
                        totalW += mls;
                        break;
                    default:
                        System.out.println("Please Enter the Correct Direction");
                }
                if (cont.equals("0")) break;

            }

            comm = "";
            if (totalS > totalN){
                subS = totalS - totalN;
                comm += "South";
            }
            else if (totalN > totalS) {
                subN = totalN - totalS;
                comm += "North";

            }
            else {
                subS = 0;
                subN = 0;
            }

            if (totalW > totalE) {
                subW = totalW - totalE;
                comm += "West";

            }
            else if (totalE > totalW) {
                subE = totalE - totalW;
                comm += "East";
            }
            else {subE = 0;subW = 0;}
            totalGen = (subS*subS) + (subN*subN) + (subE*subE) + (subW*subW);
            if (totalGen > 0 ) {
                ppSub = (float) Math.sqrt(totalGen);
                System.out.println(ppSub + "..miles  " + comm);
            }
            else {
                System.out.println("You are at the Starting Point");
            }
        }
    }

