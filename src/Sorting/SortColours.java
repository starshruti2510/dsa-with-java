package src.Sorting;

public class SortColours {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                count0++;
            }
            if(nums[i] == 1) {
                count1++;
            }
            if(nums[i] == 2) {
                count2++;
            }
        }
        int j = 0;
        for(int i = 0; i < count0; i++) {
            nums[j++] = 0;
        }
        for(int i = 0; i < count1; i++) {
            nums[j++] = 1;
        }
        for(int i = 0; i < count2; i++) {
            nums[j++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        print(nums);
        sortColors(nums);
        print(nums);
    }
}
