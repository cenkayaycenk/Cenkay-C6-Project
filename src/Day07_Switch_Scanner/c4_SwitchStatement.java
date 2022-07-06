package Day07_Switch_Scanner;

public class c4_SwitchStatement {
    public static void main(String[] args) {

        //The it works is similar to the if statement
        // if we have a lot of conditions to check

// The it works is similar to the If Statements
        // If we have a lot conditions to check,
    /*
    variable name

    switch(name){

    case ziya:
        break;
    case mahir:
    :
    :
    :
    default: djfsdn

    }
     */
            int number = 5;

            String Month = "";
            switch (number){ // Where I put my variable;

                case 1: Month = "Jan";
                    break;

                case 2 : Month = "Feb";
                    break;

                case 3 : Month = "Mar";
                    break;

                case 4 : Month = "Apr";
                    break;
                case 5 : Month = "May";
                    break;
                case 6 : Month = "Jun";
                    break;
                case 7 : Month = "Jul";
                    break;
                case 8 : Month = "Aug";
                    break;
                case 9 : Month = "Sep";
                    break;
                case 10 : Month = "Oct";
                    break;
                case 11 :Month = "Nov";
                    break;
                case 12 :Month = "Dec";

                    break;
                default: Month = "Invalid Month";

            }

            System.out.println("The month in the year is : " +Month);

        }
    }





