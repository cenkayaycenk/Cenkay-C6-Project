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
        String s2=p2.toLowerCase().replaceFirst("i","I").replaceFirst("<yourage>","41").trim();
        String s3=p3.toLowerCase().replaceFirst("i","I").replaceFirst("<yourcity>","Kitchener").trim();
        String s4=p4.toLowerCase().replaceFirst("i","I").trim();
        String s5=p5.toLowerCase().replaceFirst("i","I").trim();
        String s6=p6.toLowerCase().replaceFirst("i","I").trim();
        String s7=p7.toLowerCase().replaceFirst("i","I").trim();
        String s8=p8.toLowerCase().replaceFirst("i","I").trim();
        String s9=p9.toLowerCase().replaceFirst("i","I").trim();

        System.out.println("* Length of each sentence *");

        System.out.println("s1.length() = " + s1.length());
        System.out.println("s2.length() = " + s2.length());
        System.out.println("s3.length() = " + s3.length());
        System.out.println("s4.length() = " + s4.length());
        System.out.println("s5.length() = " + s5.length());
        System.out.println("s6.length() = " + s6.length());
        System.out.println("s7.length() = " + s7.length());
        System.out.println("s8.length() = " + s8.length());
        System.out.println("s9.length() = " + s9.length());

        System.out.println("--------------------------");
        System.out.println("* Modified sentences *");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);
        System.out.println("s9 = " + s9);

        System.out.println("--------------------------");
        System.out.println("* 1st, 4th and 5th indexed characters for each sentence *");

        System.out.println("For s1 : "+s1.charAt(1)+" "+s1.charAt(4)+" "+s1.charAt(5));
        System.out.println("For s2 : "+s2.charAt(1)+" "+s2.charAt(4)+" "+s2.charAt(5));
        System.out.println("For s3 : "+s3.charAt(1)+" "+s3.charAt(4)+" "+s3.charAt(5));
        System.out.println("For s4 : "+s4.charAt(1)+" "+s4.charAt(4)+" "+s4.charAt(5));
        System.out.println("For s5 : "+s5.charAt(1)+" "+s5.charAt(4)+" "+s5.charAt(5));
        System.out.println("For s6 : "+s6.charAt(1)+" "+s6.charAt(4)+" "+s6.charAt(5));
        System.out.println("For s7 : "+s7.charAt(1)+" "+s7.charAt(4)+" "+s7.charAt(5));
        System.out.println("For s8 : "+s8.charAt(1)+" "+s8.charAt(4)+" "+s8.charAt(5));
        System.out.println("For s9 : "+s9.charAt(1)+" "+s9.charAt(4)+" "+s9.charAt(5));

        System.out.println("--------------------------");
        System.out.println("* Paragraph with modified sentences *");

        System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9);

    }
}
