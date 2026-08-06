package src.Sorting;

public class SelectionSort {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int min = Integer.MAX_VALUE, minIndex = -1;

            for(int j=i; j<n; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, -2, 3, 9, -1, 8, 0, 4};
        print(nums);
        selectionSort(nums);
        print(nums);
    }
}
