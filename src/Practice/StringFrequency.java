package Practice;

public class StringFrequency {
    public static void main(String[] args) {

        // String Frequency
        String str = "cenkay aycenk. seray. onur onder";
        char ch = 'e';
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                freq++;
            }
        }

        System.out.println("Frequency of " + ch + " = " + freq);
    }

}

