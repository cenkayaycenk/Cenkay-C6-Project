package Day_27_ConstructorsandEncapsulation;

public class EncapsulationExTest {

    public static void main(String[] args) {
        EncapsulationEx en = new EncapsulationEx("Cevdet","Efe");
        en.setSSN("876-34-2134");
        en.setSalary(130000);

        System.out.println("The first name: "+en.Firstname);
        System.out.println("The Last name: "+en.Lastname);
        System.out.println("The Salary: "+en.getSalary());
    }
}
