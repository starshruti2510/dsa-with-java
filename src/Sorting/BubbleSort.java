package src.Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleAscending(int[] arr) {
        int n = arr.length;
        // for(int i = 0; i <= n-1; i++) {
        //     for(int j = 0; j < n-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // Optimized COde
        int swap = 0;
        for(int i = 0; i <= n-1; i++) {
            for(int j = 0; j < n-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) {
                break;
            }
        }
    }

    public static void bubbleDescending(int[] arr) {
        int n = arr.length;
        for(int i=0; i<=n-1; i++) {
            for(int j=0; j<n-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);

        //---- Optimized COde-----//
        // ----- Descending Order ------ //
        // int swap = 0;
        // for(int i=0; i<=n-1; i++) {
        //     for(int j=0; j<n-1; j++){
        //         if(arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;

        //             swap++;
        //         }
        //     }
        //     if(swap == 0) {
        //         break;
        //     }
        // }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 2, 5, 9};
        print(arr);
        System.out.println("Bubble Sort Ascending");
        bubbleAscending(arr);
        print(arr);
    }
}
