package src.Binary_Search;

import java.util.Arrays;

public class sortInDescending {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sortindescending(int[] arr) {
        for(int i = 1; i < arr.length; i++) {

            // descending order
            int key = arr[i];
            int low = 0, high = i - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(arr[mid] < key) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            //giving space 
            for(int j = i - 1; j >= low; j--) {
                arr[j+1] = arr[j];
            }
            arr[low] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {54, 21, 34, 11, 10, 4, 7};
        System.out.println("Before Sorting: ");
        print(arr);
        System.out.println("After Sorting:");
        sortindescending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
