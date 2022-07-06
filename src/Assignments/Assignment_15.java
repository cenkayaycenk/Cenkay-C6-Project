package Assignments;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {

        //Write a program Where user is being ask to select items from the list you presented for instance:
        //Select 1 for Shirt
        //Select 2 for pants
        //select 3 for dress
        //select 4 for hat
        //select 5 for shoes
        //User will select one item each time and until users has 3 items.
        //shirt price is = 40
        //pants price is = 60
        //dress price is = 100
        //hat price is = 10
        //shoes price is = 120
        //if user total amount is more than 200, user will receive 20% off on the total price (edited)
        //if user total amount is more than 150, user will receive 15% off on the total  price (edited)
        //if user total amount is more than 100, user will receive 5% off on the total price (edited)

        Scanner scanner = new Scanner(System.in);

            int pick1;          int shirtPr = 40;               int totalPr = 0;
            int pick2;          int pantsPr = 60;               double totalLast=0;
            int pick3;          int hatPr = 10;
                                int shoesPr = 120;
                                int dressPr = 100;

            System.out.println("Please pick 3 items to add to your shopping cart: ");
            System.out.println("\nSelect 1 for Shirt each $40\nSelect 2 for Pants each $60\nSelect 3 for Dress each $100\n" +
                    "Select 4 for Hat   each $10\nSelect 5 for Shoes each $120");

            System.out.println("\nPlease pick your 1st item: ");
            pick1 = scanner.nextInt();
            System.out.println("Please pick your 2nd item: ");
            pick2 = scanner.nextInt();
            System.out.println("Please pick your 3rd item: ");
            pick3 = scanner.nextInt();


            if (pick1==1){totalPr += shirtPr;
            }else if(pick1==2){totalPr += pantsPr;
            }else if(pick1==3){totalPr += dressPr;
            }else if(pick1==4){totalPr += hatPr;
            }else if(pick1==5){totalPr += shoesPr;
            }else {
                System.out.println("Invalid Selection");}

            if (pick2==1){totalPr += shirtPr;
            }else if(pick2==2){totalPr += pantsPr;
            }else if(pick2==3){totalPr += dressPr;
            }else if(pick2==4){totalPr += hatPr;
            }else if(pick2==5){totalPr += shoesPr;
            }else {
                System.out.println("Invalid Selection");}

            if (pick3==1){totalPr += shirtPr;
            }else if(pick3==2){totalPr += pantsPr;
            }else if(pick3==3){totalPr += dressPr;
            }else if(pick3==4){totalPr += hatPr;
            }else if(pick3==5){totalPr += shoesPr;
            }else {
                System.out.println("Invalid Selection");}

            if(totalPr > 200){totalLast = totalPr * 0.80;
            } else if (totalPr > 150) {totalLast = totalPr * 0.85;
            } else if (totalPr > 100) {totalLast = totalPr * 0.95;
            }else {totalLast = totalPr;}

            double dis=totalLast-totalPr;

            System.out.println("Your total price is: $" + totalPr);
            System.out.println("Your discount is: $" +    dis);
            System.out.println("Your final price is: $" + totalLast);
        }
    }