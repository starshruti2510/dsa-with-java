package src.Arrays;

/* Problem:- Concatenation of Non-Zero elements and Multiply by Sum
   Platform:- Leetcode
   
   The Approach:-
   Approach is that by finding non-zero elements in a number then make a new string storing all those elements and in another variable it store the sum and then it will return the multiplcation of both them.
   
   The Intution:-
   Intution is that:-
   1) When non-zero element found, we just simply add them in the new variable(x) by d * place + x
   2) Sum of those non-zero element also gets stored in new variable(s) by sum + d
   3) To take up the new non-zero, we will find its decimal place by n % 10
   4) To find the unique place, we will take another variable (place).

   Time Complexity:- O(n)
   Space Complexity:- O(1)
*/

public class ConcatenateNonZeroandMultiply {
    public  static long sumAndMul(int n) {
        long x = 0;         // to store non-zero elements
        long s = 0;         // to store sum of non-zero elements
        long place = 1;         // For all unique elements traversal
        while(n > 0) {
            int d = n % 10;         // to traverse each number
            
            if(d != 0) {
                x = d * place + x;          // adding up the non-zero element to the variable
                place *= 10;                // place got incremented
                s += d;                  // sum of all elements
            }
            n /= 10;                // to move to the next number by removing the previous one after storing in a variable
        }
        return x * s;           // multiplication with sum
    }
    public static void main(String[] args) {
        int n = 1020038090;
        System.out.print(sumAndMul(n));;
    }
}
