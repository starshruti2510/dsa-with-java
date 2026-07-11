package src.Sorting;

// public class BubbleSort {
//     public static void print(int[] arr) {
//         for(int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void bubble(int[] arr) {
//         int n = arr.length;
//         //----- Bubble Sort ------//
//         // for(int j=1; j<=n-1; j++) {
//         //     for(int i=0; i<n-1; i++) {
//         //         if(arr[i] > arr[i+1]) {
//         //             int temp = arr[i];
//         //             arr[i] = arr[i+1];
//         //             arr[i+1] = temp;
//         //         }
//         //     }
//         // }

//         //----- Optimized Bubble Sort-------//---> In this, we will first check whether the array is already sorted or not by using the boolean variable in the code... if it is sorted, then the for loop gets break and return the sorted array.
//         for(int i=0; i<=n-1; i++) {
//             int swap = 0;
//             for(int j=0; j<n-1-i; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;
//                 }
//             }
//             if(swap == 0) break;
//         }
//         print(arr);
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,2,7,1,0,3,4};
        
//         print(arr);
//         bubble(arr);
//     }
// }

public class BubbleSort {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubble(int[] arr) {
        int n = arr.length;
        // for(int i=0; i<=n-1; i++) {
        //     for(int j=0; j<n-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // print(arr);

        //---- Optimized COde-----//
        int swap = 0;
        for(int i=0; i<=n-1; i++) {
            for(int j=0; j<n-1; j++){
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
        print(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 2, 5, 9};
        print(arr);
        bubble(arr);
    }
}
