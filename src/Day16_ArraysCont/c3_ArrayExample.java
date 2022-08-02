package Day16_ArraysCont;

public class c3_ArrayExample {
    public static void main(String[] args) {
        // if i want to swap the elements in array

        int [] swap = {30,90,70,60}; // swap the {90,70,60,30}



        int tmp = swap[0];
        swap[0]=swap[1]; // {90,90}
        swap[1] = tmp; // {90,30}


        //  swap = {90,30}
        String [] sap = {"Ziya","Serdar"};
        String tmp1 = sap[0]; // temp1 = "Ziya"
        sap[0]=sap[1];// {"Serdar","serdar"}
        sap[1] = tmp1; // {"Serdar","Ziya"}


        System.out.println("The length of the first string in the array is: "+sap[0].length());


    }
}
