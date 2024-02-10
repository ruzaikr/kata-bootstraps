import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        final List<int[]> output = new LinkedList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (newInterval[1] < intervals[i][0]) {
                output.add(newInterval);
                output.addAll(Arrays.stream(Arrays.copyOfRange(intervals, i, intervals.length)).toList());
                return output.toArray(new int[output.size()][2]);
                // @TODO: Add the rest of the intervals to `output` and return `output`
            }

            if ( !( (newInterval[1] < intervals[i][0]) || (intervals[i][1] < newInterval[0]) ) ) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                output.add(intervals[i]);
            }

        }

        output.add(newInterval);

        return output.toArray(new int[output.size()][2]);

    }


}
