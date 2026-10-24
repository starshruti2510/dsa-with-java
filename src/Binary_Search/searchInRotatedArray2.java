package src.Binary_Search;

public class searchInRotatedArray2 {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                return true;
            }
            
            // Removing duplicates because it will create problem while searching
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }

            // Left side is sorted
            else if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // RIght side is sorted
            else {
                if(nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        int[] arr = {34, 21, 21, 45, 3, 45, 21};
        int target = 45;
        System.out.println("Array: ");
        print(arr);
        System.out.println("Target: " + target);
        System.out.println(search(arr, 45));
    }
}
