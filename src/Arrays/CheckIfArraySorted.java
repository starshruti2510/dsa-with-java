package src.Arrays;

public class CheckIfArraySorted {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int swap = 0;
        for(int i=0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]) {
                swap++;
            }
        }
        return swap <= 1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 9};
        print(nums);
        System.out.println(check(nums));
        print(nums);
    }
}
