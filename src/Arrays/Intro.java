package src.Arrays;

import java.util.*;

public class Intro {
    public static void main(String[] args) {
        //Array with initial value(size determined)
        int[] arr1 = {2,9,10,8};

        // //Empty aaray with size =5, initially all at 0
        // int[] arr2 = new int[5];

        //printing value of any index
        // System.out.println(arr1[2]);

        //setting another value at a index
        // arr1[2] = 1;
        // System.out.println(arr1[2]);

        //length of an array
        // System.out.println(arr1.length);

        //traversing an array
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
