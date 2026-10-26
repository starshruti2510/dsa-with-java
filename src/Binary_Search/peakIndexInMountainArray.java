package src.Binary_Search;

public class peakIndexInMountainArray {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int peakIndexOfMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < arr[mid+1]) {
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        print(arr);
        System.out.println(peakIndexOfMountainArray(arr));
    }
}
