package src.Arrays;

public class SquareSortedArray {
    public static int[] sortedSquare(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = j;
        int[] arr = new int[nums.length];
        while(i < j) {
            int isq = nums[i] * nums[i];
            int jsq = nums[j] * nums[j];
            if(isq > jsq) {
                arr[k--] = isq;
                i++;
            }
            else {
                arr[k--] = jsq;
                j--;
            }
        }
        arr[0] = nums[i] * nums[i];
        return arr;
    }

    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        print(nums);
        int[] c = sortedSquare(nums);
        print(c);
    }
}
