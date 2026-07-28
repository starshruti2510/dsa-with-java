package src.Sorting;

public class move0sEnd {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void move0send(int[] nums) {
        int n = nums.length;
        int swap = 0;
        for(int i=0; i <= n-1; i++) {
            for(int j=0; j < n-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            int k = 0;
            for(int a=0; a < n; a++) {
                if(nums[a] != 0) {
                    int temp = nums[a];
                    nums[a] = nums[k];
                    nums[k] = temp;
                    k++; 
                }
            }
            if(swap == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 0, 0, 1, 5, 0, 6};
        print(arr);
        move0send(arr);
        print(arr);
    }
}
