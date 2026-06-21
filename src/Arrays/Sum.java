package src.Arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //logic

        int sum = 0;
        System.out.println("Sum of all numbers:");
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}
