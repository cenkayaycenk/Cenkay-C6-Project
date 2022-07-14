package Day10_StringMethods;

public class c1_StringMethods {
    public static void main(String[] args) {

              /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
        //substring()	          Extracts the characters from a string,
        //beginning at a specified start position,

        String str1 = "LokmanEkin";
        String substr1 = str1.substring(6);
        System.out.println(substr1);
        String substr2 = str1.substring(0);
        System.out.println(substr2);
        String substr3 = str1.substring(3,6);
        String substr4 = str1.substring(3,str1.length());
        System.out.println(substr4);

        //toLowerCase()	      Converts a string to lower case letters	                       String
        String str2 = "YaSeEN";
        String lowstr1 = str2.toLowerCase();
        System.out.println(lowstr1);

        //toUpperCase()	      Converts a string to upper case letters	                      String

        String upstr1 = str2.toUpperCase();
        System.out.println(upstr1);

        //trim()	              Removes whitespace from both ends of a string	             String

        String str3 = " Cev det ";
        String trstr3 = str3.trim();
        System.out.println(trstr3);


    }
}
