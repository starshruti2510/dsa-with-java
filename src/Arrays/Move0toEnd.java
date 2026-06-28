package src.Arrays;

public class Move0toEnd {
    //------MOVING ALL ZEROES PRESENT IN AN ARRAY TO END-------
    public static void moveZero(int[] arr) {
        int j = 0;          // initially j is at index 0
        for(int i = 0; i<arr.length; i++) {             // i is scanning array
            if(arr[i] != 0) {           // if i index element is non-zero, then it will get swap with element of j index
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;            // j gets incremented after every swap
            }
        }
        System.out.println("After: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");         // printing array after moving 0 to end
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 5, 0, 8, 2};

        System.out.println("Before: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        moveZero(arr);
    }
}
