package Day15_ArrayIntro;

public class c5_MaxNumberinArray {
    // find the max number in array if integers
    public static void main(String[] args) {
        int [] miracle = {5,98,3,56,23,7}; // {-1,-5,-6,-2}
        int max = miracle[0]; // Assigning the firs value in array to the max value,
        for(int i = 0; i<miracle.length;i++){

            if(max<miracle[i]){ // Check if the index i value in array is greater than the current value of max;
                max = miracle[i];// max is 98
            }

        }
        System.out.println("The max value in array is: "+max);

    }

}
