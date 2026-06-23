package src.Arrays;

import java.util.Scanner;

//the Max.java, ReverseArray, Sum.java, and all other are part of Two Pointers
public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values in array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subarrays are:");

        //----SUBARRAYs OF AN ARRAY----
        
        // Starting index(si) starts from 0 goes to n
        for(int si = 0; si < n; si++) {
            
            // Ending index(ei) starts from si (i.e. 0=0, 1=1, 2=2, etc) goes to n so ei=si
            for(int ei = si; ei < n; ei++) {

                //Printing subarrays
                for(int k = si; k <= ei; k++) {      //k starts from si goes to only ei
                    System.out.print(arr[k] + " ");
                }
                
                System.out.println();
            }
        }
    }
}
