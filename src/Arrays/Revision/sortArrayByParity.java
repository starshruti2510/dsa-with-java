package src.Arrays.Revision;

public class sortArrayByParity {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] sortByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while(i < j) {
            while(i < j && (nums[i] % 2) == 0) {
                i++;
            }

            while(i < j && (nums[j] % 2) != 0) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 2, 0, 4};
        print(arr);
        sortByParity(arr);
        print(arr);
    }
}
