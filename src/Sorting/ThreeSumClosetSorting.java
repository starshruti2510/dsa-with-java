package src.Sorting;

import java.util.Arrays;

import src.Arrays.Revision.removeDuplicates;

public class ThreeSumClosetSorting {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int threeSumClosetSorting(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closeSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            // 1. Checking minimum boundary
            int minSum = nums[i] + nums[i+1] + nums[i+2];
            if(minSum > target) {
                if(Math.abs(minSum - target) < Math.abs(closeSum - target)) {
                    closeSum = minSum;
                }
                break;
            }

            // 2. Checking maximum boundary
            int maxSum = nums[i] + nums[n-2] + nums[n-1];
            if(maxSum < target) {
                if(Math.abs(maxSum - target) < Math.abs(closeSum - target)) {
                    closeSum = maxSum;
                }
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum == target) {
                    return currSum;
                }
                if(Math.abs(currSum - target) < Math.abs(closeSum - target)) {
                    closeSum = currSum;
                }
                if(currSum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closeSum;
    } 

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, -3, -1, 8};
        print(nums);
        System.out.println(threeSumClosetSorting(nums, 4));
    }
}
