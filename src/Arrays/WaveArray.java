package src.Arrays;

public class WaveArray {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void wave(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i=i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,9,10};
        print(arr);
        wave(arr);
        print(arr);
    }
}
