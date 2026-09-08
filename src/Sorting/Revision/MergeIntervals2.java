package src.Sorting.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals2 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merge2 = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if(interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            }
            else {
                merge2.add(prev);
                prev = interval;
            }
        }
        merge2.add(prev);
        return merge2.toArray(new int[merge2.size()][]);
    }

    public static void main(String[] args) {
        int[][] interval = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(interval));
        System.out.println(Arrays.deepToString(merge(interval)));
    }
}
