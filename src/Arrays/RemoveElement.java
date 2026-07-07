package src.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 10, 8};
        int k = removeElement(nums, 10);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
