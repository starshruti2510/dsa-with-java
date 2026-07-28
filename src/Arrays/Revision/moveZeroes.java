package src.Arrays.Revision;

public class moveZeroes {
    public static void move0s(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 2, 0, 1, 4, 0, 0, 8};
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        move0s(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
