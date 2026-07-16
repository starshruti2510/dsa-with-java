package src.Arrays;

public class MergeSortedArray {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSorted(int[] c, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(i < a.length) {
            c[k++] = a[i++];
        }
        while(j < b.length) {
            c[k++] = b[j++];
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 8};
        int[] b = {5, 9, 10, 11};
        print(a);
        print(b);
        int[] c = new int[a.length + b.length];
        mergeSorted(c, a, b);
        print(c);
    }
}
