package Assignments;

public class A28_ForLoopString {
    //Write   a   program   that   will   count   how   many   times
    // "a"   is   found   in   any   given   String:
    //String mystring="java is fun, but sometimes java is just pain.Love java java java";

    public static void main(String[] args) {

        String s1 = "java is fun, but sometimes java is just pain.Love java java java";
        System.out.println(s1);
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch) {
                count++;}
        }System.out.println(count + " 'a' is found in given String");
    }
}
