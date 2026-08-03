package src.Arrays;

public class LargestElementAfterMerge {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static long maxArrayValue(int[] nums) {
        int n = nums.length;
        long ans = nums[n - 1];
        for(int i=n-2; i>=0; i--) {         // n-2 is the left neighbour of the last element
            ans = nums[i] <= ans ? ans + nums[i] : nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 9, 1, 4, 8};
        print(nums);
        System.out.println(maxArrayValue(nums));
    }
}
