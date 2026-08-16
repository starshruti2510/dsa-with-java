package src.Sorting;

public class InsertionSort {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for(int i=1; i < n; i++) {
            int j = i;
            while(j > 0 && nums[j] < nums[j-1]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 10, 5, 2, 89, 45, 285};
        print(nums);
        insertionSort(nums);
        print(nums);
    }
}
