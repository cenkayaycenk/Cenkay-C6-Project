package Day03_ArithmeticOperations;

public class c3_RelationalOperations {
    public static void main(String[] args) {

        int number = 10;
        //== the options are either true or false

        boolean b1= 10==10;
        System.out.println(b1);// true

        boolean b2= ">" == ">";
        System.out.println(b2);

        // 2nd >= checks two things and if it is greater than or equal it will return true
        boolean b3= 12>=10;
        System.out.println(b3);

        // 3th ,<=check 2 things if it is less or equal it returns as true otherwise is false
        boolean b5=14<=15;
        System.out.println(b5);

        //4th != ---- it means not equal
        boolean b6= 14!=14;
        System.out.println(b6);

        // ! will convert true to false

        boolean x= !(('C'=='c') == (13==14) == !(("er"=="ER")==(true==true)));
        System.out.println(x);


  }


}





