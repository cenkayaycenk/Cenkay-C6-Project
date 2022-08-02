package Day18_MultiDimensionalArrays;

public class c5_ForeachWStringMethods {
    // String is not a collection it is an object so We can not use Foreach loop to iterate on every chars in String

    public static void main(String[] args) {

        String StName = "SERAY";

        char [] Lt = StName.toCharArray(); // this will create a char array

        for (char ch:Lt) { // We can iterate on the char array

            System.out.println("The Chars: "+ch);// print all the chars

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        String cool = "Java is Cool but it is hard";

        String [] wrd = cool.split(" "); // it will create a string array from the string by splitting
        // with specified char

        for(String words:wrd){

            System.out.println("Words are: "+words);
        }








    }
}
