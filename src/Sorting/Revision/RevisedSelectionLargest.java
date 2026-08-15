package src.Sorting.Revision;

class RevisedSelectionLargest {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionLargest(int[] nums) {
        int n = nums.length;
        for(int i = n-1; i > 0; i--) {
            int max = Integer.MIN_VALUE, maxIndex = 0;
            for(int j = 0; j <= i; j++) {
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
        int[] nums = {4, 9, 1, 5, 0, 3};
        print(nums);
        selectionLargest(nums);
        print(nums);
    }
}