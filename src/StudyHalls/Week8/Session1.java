package StudyHalls.Week8;

public class Session1 {

    /**
     *
     * Method: it's a block of the code, that will be executed when it's called.
     */
    public static void main(String[] args) {

        MakeLines();
        Utils.MakeLines();

      //  makeLines();

        WriteName("Renastech");

        String name1="Renastech";

        WriteName(name1);


    }


    public static void sayHello(){
        System.out.println("Hello World!");
    }

    public static void MakeLines(){
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("****************************");
        System.out.println("%%%%%% New Line %%%%%%%%%%%%%");
    }


    public static void WriteName(String name){

        System.out.println(name);

    }
}
