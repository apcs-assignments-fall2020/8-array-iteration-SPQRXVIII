import java.util.Arrays;


public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] a = new int[arr.length];
        for(int i = 0; i < a.length; i++){
            a[i] = arr[arr.length - 1 -i];
        }
        return a;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            double ra = ((double)arr[i])/((double)arr[i-1]);
            double r= ((double)arr[1])/((double)arr[0]);
            if (ra!=r) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16, 33};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(secondLargest(arr));
        System.out.println(isGeometric(arr));
    }
}
