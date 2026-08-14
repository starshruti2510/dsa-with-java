package src.Arrays.Revision;

public class removeDuplicates {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int remove(int[] nums) {
        // 1. First Way
        if(nums.length == 0) {
            return 0;
        }
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        print(nums);
        int k = remove(nums);
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
