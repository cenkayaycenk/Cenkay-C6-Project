package Assignments;

public class Assignment_20 {
    public static void main(String[] args) {

//        First create one string and copy paste below paragraf.
//        And make modifications on the given paragraph listed below.
//        Make sure to create multiple string with each sentence from given paragraph
//        Make sure each sentence start with upper case letter.
//        Make sure city name start with the capital letter.
//        Make sure the rest of the letters are lower case.
//        Make sure to change the name, age and city information based on your information
//        make sure to get rid of the empty spaces in front and end of the sentences.
//        after you make the modification check each sentense’s length
//        Print each sentence and make sure they are correctly modified.
//        Print 1st, 4th and 5th indexed characters for each sentence
//        At the end combine all the sentence to get proper paragraph with modified sentences

        String para="hello my name is <yourname>.     " +
                " i am <yourage> years old. " +
                " i live in <yourcity>.  " +
                " I have been in IT industry for about 6 years. " +
                " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. " +
                " I have experience in EducatION, energy,finance and some manY Other AREAs. " +
                " i HAve scrum master and Oracle java Programmer certificates.   " +
                " i love JaVA.  " +
                " I designed and DEVELoped many automation test cases using BDD FRamework. ";

        String  p1="hello my name is <yourname>.     ";
        String  p2="i am <yourage> years old. ";
        String  p3="i live in <yourcity>.  ";
        String  p4="I have been in IT industry for about 6 years. ";
        String  p5="I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. ";
        String  p6="I have experience in EducatION, energy,finance and some manY Other AREAs. ";
        String  p7="i HAve scrum master and Oracle java Programmer certificates.   ";
        String  p8="i love JaVA.  ";
        String  p9="I designed and DEVELoped many automation test cases using BDD FRamework. ";



        String s1=p1.toLowerCase().replaceFirst("h","H").replaceFirst("<yourname>", "Cenkay").trim();
        String s2=p2.toLowerCase().replaceFirst("h","I").replaceFirst("<yourage>","41").trim();
        String s3=p3.toLowerCase().replaceFirst("i","I").replaceFirst("<yourcity>","Kitchener").trim();
        String s4=p4.trim();
        String s5=p5.toLowerCase().replaceFirst("i","I").trim();
        String s6=p6.toLowerCase().replaceFirst("i","I").trim();
        String s7=p7.toLowerCase().replaceFirst("i","I").trim();
        String s8=p8.toLowerCase().replaceFirst("i","I").trim();
        String s9=p9.toLowerCase().replaceFirst("i","I").trim();

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());



;






    }
}
