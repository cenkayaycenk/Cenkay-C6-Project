package Assignments;

public class A31_ReverseString {
    //    (String) Reverse
//    Write a  program that can reverse  a String
//
//    Ex: Reverse("ABCDE"); ==> EDCBA

    public static void main(String[] args) {

        String Name="RENASTECH";
        String NameReverse="";

        for ( int i=Name.length()-1;i>=0; i--){
            NameReverse+=Name.charAt(i);
        } System.out.println("Reverse of RENASTECH is " +NameReverse);
    }
}
