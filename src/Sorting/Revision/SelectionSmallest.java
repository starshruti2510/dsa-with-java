package src.Sorting.Revision;

public class SelectionSmallest {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void smallestSelection(int[] nums) {
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
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 9, 4, 2, 6, 8};
        print(nums);
        smallestSelection(nums);
        print(nums);
    }
}
