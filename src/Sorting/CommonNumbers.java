package src.Sorting;

import java.util.Arrays;

public class CommonNumbers {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] common(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[101];
        boolean[] arr2 = new boolean[101];
        for(int i : nums1) {
            arr1[i] = true;
        }

        for(int i : nums2) {
            arr2[i] = true;
        }
        int ans1 = 0;
        int ans2 = 0;
        for(int i : nums1) {
            if(arr2[i]) {
                ans1++;
            }
        }
        for(int i : nums2) {
            if(arr1[i]) {
                ans2++;
            }
        }
        int[] ans = {ans1, ans2};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 1, 9, 2};
        int[] b = {4, 1, 2, 9};
        print(a);
        print(b);
        int[] hehe = common(a, b);
        System.out.println(Arrays.toString(hehe));
    }
}
