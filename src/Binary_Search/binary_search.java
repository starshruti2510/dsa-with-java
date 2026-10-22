package src.Binary_Search;

public class binary_search {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            }
            else if(nums[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 8, 4, -1, -6, 0, 5, 4};
        print(nums);
        System.out.println("After Searching:-");
        System.out.println(binarysearch(nums, 5));
    }
}
