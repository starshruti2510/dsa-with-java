package src.Sorting;

import src.Arrays.ArrayList.arraylist;

public class RelativeSortArray {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] relativeSort(int[] arr1, int[] arr2) {
        int length = 0;
        for(int i=0; i<arr1.length; i++) {
            length = Math.max(length, arr1[i]);
        }

        int[] count = new int[length+1];
        for(int i=0; i<arr1.length; i++) {
            count[arr1[i]]++;
        }

        int[] nums = new int[arr1.length];
        int index = 0;
        for(int i=0; i<arr2.length; i++) {
            while(count[arr2[i]] > 0) {
                nums[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }

        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        print(arr1);
        print(arr2);
        int[] a = relativeSort(arr1, arr2);
        print(a);
    }
}
