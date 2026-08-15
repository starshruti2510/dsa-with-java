package src.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void print(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i <= n-1; i++) {
            int j = i+1, k = n-1;
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        print(nums);
        List<List<Integer>> arr = threeSum(nums);
        System.out.println(arr);
    }
}