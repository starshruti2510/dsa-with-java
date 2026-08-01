package src.Arrays.Revision;

public class containerMostWater {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int mostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currArea);

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {2, 1, 9, 5, 4, 10, 3, 8};
        print(height);
        System.out.println(mostWater(height));
    }
}
