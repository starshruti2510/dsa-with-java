package src.Sorting.Revision;

public class RevisedBubble {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubblesort(int[] nums) {
        int n = nums.length;

        // 1. Normal
        // for(int i = 0; i <= n-1; i++) {
        //     for(int j = 0; j < n-1; j++) {
        //         if(nums[j] > nums[j+1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }

        // 2. Optimized
        int swap = 0;
        for(int i = 0; i <= n-1; i++) {
            for(int j = 0; j < n-1; j++) {
                if(nums[j] > nums[j+1]) {
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
        int[] nums = {9, 3, 1, 5, 6};
        print(nums);
        bubblesort(nums);
        print(nums);
    }
}
