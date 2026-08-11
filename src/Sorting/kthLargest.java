package src.Sorting;

public class kthLargest {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int kthlargestelement(int[] nums, int k) {                                                                 
        int n = nums.length;
        for(int i = k; i >= 0; i--) {
            int max = Integer.MIN_VALUE, maxIndex = 0;

            for(int j = 0; j <= i; j++) {
                if(nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        return nums[k-1];
    }
    public static void main(String[] args) {
        int[] nums = {9, 2, 1, 5, 3, 8};
        print(nums);
        System.out.println(kthlargestelement(nums, 3));
    }
}
