package src.Sorting;

public class IsSorted {
    public static boolean checkSorted(int[] arr) {
        int n = arr.length;
        for(int i=0; i<=arr.length; i++){
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 7 , 2, 10};
        System.out.println(checkSorted(nums));
    }
}
