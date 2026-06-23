package src.Arrays;

public class Rotate90 {

    public static void transpose(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] arr) {
        transpose(arr);
        for(int i=0; i<arr.length; i++) {
            int si = 0;
            int ei = arr[0].length-1;
            while(si < ei) {
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;

                si++;
                ei--;
            }
        }
    }

    public static void rotate(int[][] arr) {
        reverse(arr);
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},
                    {9,10,11,12},
                {13,14,15,16}};
        
        rotate(arr);
    }
}
