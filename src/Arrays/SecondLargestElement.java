package src.Arrays;

public class SecondLargestElement {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int n = arr.length;

        // find first max
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // find second max
        for(int i=0; i<n; i++) {
            if(arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,9,10};
        print(arr);
        System.out.println(secondLargest(arr));
    }
}
