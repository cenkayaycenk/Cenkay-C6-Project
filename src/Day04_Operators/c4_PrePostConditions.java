package Day04_Operators;

public class c4_PrePostConditions {



        public static void main(String[] args) {

            // after ++

            int num = 10;
            System.out.println(num++);
            System.out.println(num);
            System.out.println(num++);
            System.out.println(num);

            // before ++ and your variable;

            int num1 = 10;
            System.out.println(++num1);
            System.out.println(num1);

            // num++ this num value will not increase immidiately
            // ++num this num value will increate right the way

            // after -- (variable--)

            int num2 = 20;
            System.out.println(num2--);
            System.out.println(num2);

            int num3 = 15;
            System.out.println(--num3);







        }


    }