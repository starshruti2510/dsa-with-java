package src.Arrays;

import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];

        //set
        arr[2][5] = 8;

        //get
        System.out.println(arr[2][5]);
        System.out.println(arr[0][4]);

        //row count
        System.out.println(arr.length);

        //column count
        System.out.println(arr[0].length);

        //traversal
        for(int i =0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                //code
            }
        }
    }
}