package Day06_IfElseContinue;

public class c5_TernaryExample2 {
    public static void main(String[] args) {
        // Points > 100 or <0 - Out of Range
        //90 -100 Grade A
        // 80-90 Grade B
        // 70-80 Grade C
        // 60-70 Grade D
        // 50-60 Grade F
        // Less than 50 Grade Failed


        int Points = 0;
        String Grade;

        Grade = (Points<0 || Points>100) ? "Out if Range":(Points >=90 && Points <=100) ? "Grade A":
                (Points<90 && Points>=80) ? "Grade B":(Points <80 && Points>=70) ? "Grade C" :
                        (Points<70 && Points>=60) ? "Grade D": (Points <60 && Points>=50) ? "Grade F" : "Grade Failed";

        System.out.println("Student Grade is: " +Grade);

    }
}
