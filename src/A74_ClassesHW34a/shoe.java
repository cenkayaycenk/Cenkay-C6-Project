package A74_ClassesHW34a;

public class shoe {

    /*
    Write a Class and Name it Shoes that has following attributes
1) Brand
2) Size
3) Type
4) Price
Also has following Methods
1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
2) Print(): Where it prints the the value of attributes.

Create 4 different Object (Class Instance) of Shoes Class. and add it to array-list.
Print all of the Shoe instances that has price over 10,
Apply discount for those 15% off on the ones that has Price of 50 or over
     */

    String brand;
    double size;
    String type;
    double price;

    public void SetInfo(String brn, double sz, String typ, double prc){
        brand=brn;size=sz;type=typ;price=prc;
    }
    public void Print(){
        System.out.println("Shoe Brand is : "+brand+"\nShoe Size is : "+size+"\nShoe Type is : "
                +type+"\nShoe price is : "+price);
    }

}
