package src.Sorting.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static List<List<Integer>> sumof3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i <= n-2; i++) {
            int j = i + 1, k = n - 1;
            
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
        List<List<Integer>> arr = sumof3(nums);
        System.out.println(arr);
    }
}
