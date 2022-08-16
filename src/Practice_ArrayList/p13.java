package Practice_ArrayList;

import My_Util.breaking;

import java.util.*;

public class p13 {
    public static void main(String[] args) {

            int i=0, size;
            Scanner scan = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();

            System.out.println("How many elements you want in list? ");
            size = scan.nextInt();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter elements: ");
            while(i<size)
            {
                list.add(scan2.nextLine());
                i++;
            }

            //Before sorting
            System.out.println("Before Sorting: "+ list);

        breaking.Lines();

            // Sorting the list Ascending order
            Collections.sort(list);
        System.out.println("Ascending order: " +list);

        breaking.Lines();

            // Sorting the list in Descending order
            Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order: " +list);


        }
    }

