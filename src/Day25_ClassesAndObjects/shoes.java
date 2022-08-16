package Day25_ClassesAndObjects;

import My_Util.breaking;

public class shoes {
    double size;
    String color;
    String brand;

    public void print(){
        System.out.println("The shoe is: "+brand+" \nThe size of shoe is: "+size+" \nThe color is : "+color );

    }
    public double IncreaseSize(double a){
        size+=a;
        return size;
    }
    public void ChangeColor(String clr){
        color=clr;
    }

    public static void main(String[] args) {
        shoes shoe1=new shoes();
        shoe1.brand="Nike";
        shoe1.color="Red";
        shoe1.size=9.5;

        shoe1.print();


        double newSize= shoe1.IncreaseSize(1.5);
        System.out.println("newSize = " + newSize);

        System.out.println(shoe1.size);
        breaking.Lines();
        shoe1.ChangeColor("Blue");
        shoe1.print();


    }



}
