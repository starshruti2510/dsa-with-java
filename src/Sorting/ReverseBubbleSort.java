package src.Sorting;

public class ReverseBubbleSort {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseBubbleSort(int[] nums) {
        int n = nums.length;
        int swap = 0;
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<n-1; j++) {
                if(nums[j] < nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    swap++;
                }
            }
            if(swap == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {9, 1, 3, 2, 5, 0};
        print(nums);
        reverseBubbleSort(nums);
        print(nums);
    }
}
