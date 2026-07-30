package src.Arrays.Revision;

/* Problem:- Check if an array is sorted and rotated
   Platform:- LeetCode
   
   Intution:- We have to check that whether an array is sorted and rotated. By making sure that it should not get out of the bound when reaches to the end of the element of an array so we will wrap the array.
   
   Approach:- To check whether an array is rotated and sorted, we will initialize an variable to check each element from 0 to length of an array. We will check whether the current element is greater than the next element or not, if it then varible gets incremented and then we will return the value by swap<=1. We have to remember that an array will not get out of the bound so we will wrap the array when reaches at the end of an array by nums[(i+1)%n].
   
   Time Complexity:- O(n)
   Space Complexity:- O(1)
*/

public class checkIfArraySortedRotated {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static boolean arraySortedRotated(int[] nums) {
        int n = nums.length;
        int swap = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]) {
                swap++;
            }
        }
        return swap<=1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        print(arr);
        System.out.println(arraySortedRotated(arr));
        print(arr);
    }
}
