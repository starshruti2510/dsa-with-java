package src.Sorting;

public class kthSmallest {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int kthsmallestElement(int[] nums, int k) {
        int n = nums.length;
        for(int i=0; i < k; i++) {
            int min = Integer.MIN_VALUE, minIndex = -1;

            for(int j = 0; j <= i; j++) {
                if(nums[j] < max) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums[k-1];
    }

    public static void main(String[] args) {
        int[] nums = {9, 2, 1, 5, 3, 8};
        print(nums);
        System.out.println(kthsmallestElement(nums, 3));
    }
}
