package Day16_ArraysCont;

import java.util.Scanner;

public class c1_Homework7 {

        /*
    Write code where:
- User is asked to enter a string,
- Use that string to see how many of 3 character substring is Palindrome
- Print All the substring Palindrome Substrings
- Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.
     */

        public static void main(String[] args) {

            // b a n a n a  // ban // ana  // nan //ana 6-3 = 3


            // index       0,1,2,3,4,5

            // apple == > ora // ran // ang // nge   the range is 0 - lenght - 3  if I want 3 chars substring it still will
            // lenght - 3

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a string: ");
            String input = sc.next();
            int count = 0;

            for (int i = 0; i <= input.length()-3; i++) {

                String sub = input.substring(i,i+3); // starting is included but the ned point is not,

                String reversesub = "";
                for (int j = sub.length()-1; j >=0 ; j--) {

                    reversesub = reversesub+sub.charAt(j);


                }
                if(reversesub.equals(sub)){
                    count++;
                    System.out.println("the P sub is: "+sub);
                }



            }
            System.out.println("The total count of P substring with 3 char: "+count);




        }
    }

