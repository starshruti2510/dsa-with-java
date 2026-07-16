package src.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //input
        arr.add(19);
        arr.add(10);
        arr.add(5);
        arr.add(8);
        arr.add(7);
        //to get output
        System.out.println(arr.get(2));
        //update
        arr.set(3, 15);

        System.out.println(arr);

        //to add value at a specific index
        arr.add(2, 20);
        System.out.println(arr);

        //reverse
        Collections.reverse(arr);
        System.out.println(arr);

        //reverse by scratch
        int i = 0;
        int j = arr.size()-1;
        while(i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }
        System.out.println(arr);
    }
}
