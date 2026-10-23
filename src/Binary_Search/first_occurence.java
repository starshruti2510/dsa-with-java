package src.Binary_Search;

public class first_occurence {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int firstSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] < target) {
                low = mid + 1;
            }
            else if(arr[mid] > target) {
                high = mid - 1;
            }
            else {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        print(arr);
        System.out.println("The first occurences occured in an Array:-"); 
        System.out.println(firstSearch(arr, 5));
    }
}
