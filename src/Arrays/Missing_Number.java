package src.Arrays;

public class Missing_Number {
    //-------APPROACH 1(SUM)---------
    //missing number concept
    // public static void missingNumber(int[] arr) {
    //     int n=6;
    //     //actual sum
    //     int sum = 0;
    //     for(int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     System.out.println("actual sum: " + sum);

    //     //expected sum
    //     int expected = 0;
    //     for(int i = 0; i <= n; i++) {
    //         expected += i;
    //     }
    //     System.out.println("Expected Sum: " + expected);

    //     //to find missing number
    //     int missing = expected - sum;
    //     System.out.println("Missing number: " + missing);
    // }

    //---------APPROACH 2(XOR)-----------
    public static int missingNumber(int[] arr) {
        int xor = arr.length;           // takes arr length as 6
        for(int i = 0; i < arr.length; i++) {           // goes from 0 to 5 as it is <arr.length
            xor ^= i;                   // generates expected number 6^0^1^2^3^4^5 as it takes i
            xor ^= arr[i];                  // XOR of expected number (0^1^2^3^4^5^6) with actual numbers (0,1,2,3,4,6)
        }
        System.out.println("Missing number: " + xor);
        return xor;
    }
    public static void main(String[] args) {
        int n=6;
        int[] arr = {0, 1, 2, 3, 4, 6};
        
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        missingNumber(arr);
    }
}
