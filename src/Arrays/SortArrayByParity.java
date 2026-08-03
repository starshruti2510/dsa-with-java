package src.Arrays;

public class SortArrayByParity {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] sortByParity(int[] nums) {
        int n = nums.length;
        int evenP = 0, oddP = n - 1;
        
        while(evenP < oddP) {
            while(evenP < oddP && nums[evenP] % 2 == 0) {
                evenP++;
            }
            while(evenP < oddP && nums[oddP] % 2 != 0) {
                oddP--;
            }

            int temp = nums[evenP];
            nums[evenP] = nums[oddP];
            nums[oddP] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3, 10};
        print(nums);
        sortByParity(nums);
        print(nums);
    }
}
