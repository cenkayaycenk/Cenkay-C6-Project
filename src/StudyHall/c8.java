package StudyHall;

public class c8 {

    // create a program that will reverse a string. please use while loop
    public static void main(String[] args) {

        String str="cenkay";

        int index=str.length()-1;// 6-1=5 length
        String reversed="";

        while (index>=0){
            reversed+=str.charAt(index);
            index--;
        }
        System.out.println("reversed = " + reversed);

    }
}
