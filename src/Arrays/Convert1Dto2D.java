package src.Arrays;

/* 
   Problem:- Convert 1D array to 2D array
   Platform:- Leetcode
   
   Intution:-
   The intution is the size of 1D array and 2D array is same i.e. m*n = array.length.
   
   Approach:-
   The approach to solve this is:-
   1) The size of 2D array is m * n which is equal to length or size of 1D array.
   2) If the size is not equal, then it will return the empty 2D array
   3) If it is equal then the current index gets incremented to as the assigning values in the 2D array for m rows and n columns.
   
   Time Complexity:- 
   
   Space Complexity:- 
*/

public class Convert1Dto2D {
    public static int[][] construct2D(int[] nums, int m, int n) {
        int k = nums.length;
        if(m * n != k) {
            return new int[0][0];
        }
        int[][] ary = new int[m][n];
        int idx = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                ary[i][j] = nums[idx++];
            }
        }
        return ary;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,9,1,5,7};
        int[][] k = construct2D(nums, 2, 3);
        for(int i=0; i<k.length; i++) {
            for(int j=0; j<k[0].length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
    }
}
