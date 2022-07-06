package Assignments;

public class Assignment_4 {
    public static void main(String[] args) {

        float bill = 400 ;

        float tip1 = bill * 0.15f;
        float tip2 = bill * 0.20f;
        float total1 = bill + tip1;
        float total2 = bill + tip2;

        if(bill>99 && bill<280){
            System.out.println("The bill : " + bill+ " \tThe tip : " + tip1 + " \tTotal value : " + total1 );
        }else if(bill<=0){
            System.out.println("Invalid amount");
        }else {
            System.out.println("The bill : " + bill+ " \tThe tip : " + tip2 + " \tTotal value : " + total2);
        }

    }
}
