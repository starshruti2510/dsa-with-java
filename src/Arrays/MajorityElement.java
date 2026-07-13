package src.Arrays;

import java.util.Arrays;

// Problem:- Majority Element in an array
// Platform:- LeetCode

// INTUTION:- We have to find the number which appears majority times in an array. So, we also know that the majority times appear in an array by [n/2] times in it.

// APPROACH:- For approach, we will simply sort the array then take any variable which stores the length of an array. Then at last to find the number which comes majority times in an array, we will simply returns the element in an array by  nums[n/2].

// As we will use sort element, then it perform dual pivot in-place sort so time and space complexity will be:-
// Time Complexity:- O(n log n)
// Space COmplexity:- O(log n)

// SOLUTION:- 
public class MajorityElement {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int Majority(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int a = arr[n/2];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(i == a) {
                count++;
            }
        }
        if(count > (n/2)) {
            return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 5, 9, 1, 9, 9};
        print(arr);
        System.out.println(Majority(arr));
    }
}