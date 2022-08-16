package Day24_ArrayListBulk;

public class InstanceofHuman {

    //Scanner sc = new Scanner();

    public static void main(String[] args) {
        Human FirstHuman = new Human();
        FirstHuman.SetEssentials(36, "Adem", "Eve");
        FirstHuman.SetNonEssentials("QA Engineer", "Bi", 6.9, 190.90);
        FirstHuman.PrintJobHanW();
        int Adamsage = FirstHuman.GetAge();
        System.out.println("The age of Adam: " + Adamsage);

        System.out.println("The human is: " + FirstHuman);
        System.out.println("The Name for Human instance:  " + FirstHuman.GetName());

        System.out.println("The age is: " + FirstHuman.age);

    }


}
