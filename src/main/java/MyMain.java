import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] result= new int[arr.length];
        int smeerk=0;
        for (int i=arr.length-1; i>=0; i--){
            result[smeerk]=arr[i];
            smeerk++;
        }
        return result;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double smeel=(double) arr[1]/arr[0];
        for(int i=2; i<arr.length; i++){
            if((double) (arr[i])/(double) (arr[i-1])!=smeel){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
