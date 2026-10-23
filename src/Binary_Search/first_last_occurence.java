package src.Binary_Search;

import java.util.ArrayList;

public class first_last_occurence {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> find(int[] arr, int x) {
        int low = 0, high = arr.length - 1, firstidx = -1, lastidx = -1;
        ArrayList<Integer> list = new ArrayList<>();
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] < x) {
                low = mid + 1;
            }
            else if(arr[mid] > x) {
                high = mid - 1;
            }
            else {
                firstidx = mid;
                high = mid - 1;
            }
        }
        list.add(firstidx);
        low = 0;
        high = arr.length - 1;
        while(low <= high) {
            int mid2 = (low + high) / 2;
            if(arr[mid2] < x) {
                low = mid2 + 1;
            }
            else if(arr[mid2] > x) {
                high = mid2 - 1;
            }
            else {
                lastidx = mid2;
                low = mid2 + 1;
            }
        }
        list.add(lastidx);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        System.out.println("Array:-");
        print(arr);
        System.out.println("Target: " + x);
        System.out.println("First and Last Occurences:-");
        System.out.println(find(arr, x));
    }
}
