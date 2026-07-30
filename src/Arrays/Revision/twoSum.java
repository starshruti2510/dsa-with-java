package src.Arrays.Revision;

import java.util.Arrays;

public class twoSum {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] sumof2(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i <= n-1; i++) {
            for(int j=i+1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 6, 2};
        print(arr);
        int[] ns = sumof2(arr, 11);
        System.out.println(Arrays.toString(ns));
    }
}
