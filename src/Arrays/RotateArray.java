package src.Arrays;

/* 
   Problem:- Rotate Array
   Platform:- LeetCode
   
   INTUTION:-
   The intution is that to rotate an array, we can easily do it by reversing it then rotating it.
   
   APPROACH:-
   The approach for this problem is that:-
   1) First do the reverse of whole array from 0 to n-1.
   2) Then reverse first k elements of an array from 0 to k-1.
   3) Then reverse other number after the k elements from k to n-1.
   4) If the current pointer reaches at the end of an array then the array gets wrap itself and the last element goes to the first index by k % n
*/

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        return nums;
    }

    public static void reverse(int[] nums, int si, int ei) {
        while(si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;

            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 9, 1, 0, 2, 8};
        int[] k = rotate(nums, 4);
        for(int i=0; i<k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }
}
