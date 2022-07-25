package Day14_NestedLoops;

public class c6_BreakAndContforOuter {
    public static void main(String[] args) {

        hawre:
        for (int i = 0; i < 3; i++) {

            System.out.println("Outer Loop I value: "+i);

            for (int j = 0; j < 3; j++) {

                if(j == 2){
                    break hawre; // Break the outer loop using Label "hawre"
                }
                System.out.println("            From the Inner Loop j value: " +j);

            }

        }

        System.out.println("____________________________________");
        Ozan:
        for (int i = 0; i < 3; i++) {

            System.out.println("Outer Loop I value: "+i);

            for (int j = 0; j < 3; j++) {

                if(j == 2){
                    continue Ozan; // Cont from outer loop using Label "Ozan"
                }
                System.out.println("            From the Inner Loop j value: " +j);

            }

        }
    }
}
