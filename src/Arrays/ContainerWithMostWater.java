package src.Arrays;
import java.util.*;


public class ContainerWithMostWater {
    
    // The question is about that the container has two poles and we have to store the maximum water in the container by giving an array.

    // The intution is:-
    // 1) The smaller pole is the limiting height.
    // 2) The width always decrease no matter which poles moves.
    // 3) The only hope is to limiting the smaller pole by finding out the taller limiting pole which may can increase the maximum area of the container.

    // The approach is to use the two pointers in an array:-
    // 1) To find the height, we have to take the minimum height.
    // 2) To find the width, the right and left gives the width of the container.
    // 3) We always move the smaller pointer to maximize area of the container.
    // Formula for current area:- area = min(height(left), height(right)) * (right-left)
    // To find the maximum:- math.max(max, current)

    // ----- Container With Most Water ------- //
    public static int maxArea(int[] height) {
        int left = 0;               // index 0
        int right = height.length - 1;              // index last
        int max = 0;
        while(left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currArea);

            if(height[left] < height[right]) {
                left ++;
            }
            else {
                right --;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 9, 10, 3, 4, 8, 100, 5};
        
        System.out.println("The maximum area of containing most water is " + maxArea(nums));
    }
}
