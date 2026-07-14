package src.Arrays;

public class Seggregate0s1s {
    public static void seggregate(int[] arr) {
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        while(si < ei) {
            if(arr[si] == 0) {
                si++;
            }
            else if(arr[ei] == 1) {
                ei--;
            }
            else if(arr[si] == 1 && arr[ei] == 0) {
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;

                si++;
                ei--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        int m = arr.length;
        for(int i=0; i<m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        seggregate(arr);
        for(int i=0; i<m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
