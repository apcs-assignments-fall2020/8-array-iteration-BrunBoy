public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] result= new int[arr.length];
        int smeerk=arr.length;
        for (int i=arr.length; i>0; i--){
            result[i-1]=arr[smeerk];
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
        for (int i=arr.length; i>=0; i--){
            if (arr[i-1]/arr[i-2]!=arr[i-2]/arr[i-3]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
