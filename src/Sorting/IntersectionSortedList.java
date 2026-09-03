package src.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionSortedList {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums1) {
            s.add(i);
        }
        for(int i : nums2) {
            if(s.contains(i)) {
                s.remove(i);
                l.add(i);
            }
        }
        int[] arr = new int[l.size()];
        int i = 0;
        for(int n : l) {
            arr[i++] = n;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        print(nums1);
        print(nums2);
        int[] arr = intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
}
