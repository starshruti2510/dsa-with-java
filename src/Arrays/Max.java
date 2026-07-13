package src.Arrays;

import java.util.*;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers of array: ");
        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //MAXIMUM OF AN ARRAY
        int max = arr[0];           // also Integer.MIN_VALUE
        for(int i=0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}