package src.Arrays.Revision;

public class removeElement {
    public static int remove(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
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
        int[] nums = {9, 1, 4, 8, 5, 2};
        int k = remove(nums, 1);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
