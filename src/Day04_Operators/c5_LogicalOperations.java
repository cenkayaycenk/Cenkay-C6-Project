package Day04_Operators;

public class c5_LogicalOperations {

    public static void main(String[] args) {

        // AND ==> "&&", If an operation contains
        // AND (&&) in order for the result to be true all of them should result to true

        boolean balls = (12>7)&&(3<8)&&(9>=7);
        System.out.println(balls);

        boolean flowers = (true)&&(3<=8)&&(8!=9)&&(false);
        System.out.println(flowers);

        // OR operation "||" the that OR works, if any of the comperassion is true it return true;

        boolean flo = (9>11)||(6<9);
        System.out.println(flo);

        boolean shoes = ("Ziya"=="ziya")||('C'=='c');
        System.out.println(shoes);

        // NOT "!"

        boolean cars = !("red" == "blue");
        System.out.println(cars);

        boolean Q = !(((4==5)||(7<9))&&((8<=10)||(true)));
        System.out.println(Q);
        String firstName = "yilmaz";









    }
}
