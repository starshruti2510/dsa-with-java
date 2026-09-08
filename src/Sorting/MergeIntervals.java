package src.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));      // Sorting from starting element
        List<int[]> merge1 = new ArrayList<>();         // Created an ArrayList for merged intervals
        int[] prev = intervals[0];                      // Created an array for previous interval which consist original interval's starting element

        for(int i = 1; i < intervals.length; i++) {         // Checking for overlapping intervals
            int[] interval = intervals[i];              // Created an array to store all interval in it.
            if(interval[0] <= prev[1]) {                // If starting element of one interval is small than end element go interval
                prev[1] = Math.max(prev[1], interval[1]);           // Then the end gets replaced from the maximum element from the intervals
            }
            else {
                merge1.add(prev);                   // If they don't overlap then we simple merge the intervals
                prev = interval;                    
            }
        }
        merge1.add(prev);
        return merge1.toArray(new int[merge1.size()][]);         // Converting the merge in 2D array
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(intervals));
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
