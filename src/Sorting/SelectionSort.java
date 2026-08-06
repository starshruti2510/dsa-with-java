package src.Sorting;

public class SelectionSort {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] nums) {
        // Find Smallest Element first
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int min = nums[i], minIndex = i;

            for(int j=i+1; j<n; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        Find Largest Element first
        int n = nums.length;
        for(int i=n-1; i>0; i--) {
            int max = Integer.MIN_VALUE, maxIndex = 0;

            for(int j=0; j<=i; j++) {
                if(nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, -2, 3, 9, -1, 8, 0, 4};
        print(nums);
        selectionSort(nums);
        print(nums);
    }
}
