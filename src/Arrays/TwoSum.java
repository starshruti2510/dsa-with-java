package src.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {1,4,9, 5,15};
        print(arr);
        int[] ans = twoSum(arr, 19);
        System.out.println(Arrays.toString(ans));
    }
}
