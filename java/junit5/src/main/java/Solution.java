import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        final List<int[]> output = new LinkedList<>();

        int i = 0;
        while (intervals[i][1] < newInterval[0]) {
            output.add(intervals[i]);
            i++;
        }

        while ( !( (newInterval[1] < intervals[i][0]) || (intervals[i][1] < newInterval[0]) ) ) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        output.add(newInterval);

        while (i < intervals.length) {
            output.add(intervals[i]);
            i++;
        }

        return output.toArray(new int[output.size()][2]);

    }


}
