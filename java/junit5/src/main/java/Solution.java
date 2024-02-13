import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public int[][] kClosest(int[][] points, int k) {

        final PriorityQueue<int[]> minHeap = new PriorityQueue<>(points.length, Comparator.comparingInt(ints -> ints[0]));

        for (int[] point : points) {
            final int distance = getDistance(point[0], point[1]);
            minHeap.add(new int[]{distance, point[0], point[1]});
        }

        final int[][] kClosestPoints = new int[k][2];

        for (int i = 0; i < k; i++) {
            final int[] point = minHeap.remove();
            kClosestPoints[i][0] = point[1];
            kClosestPoints[i][1] = point[2];
        }

        return kClosestPoints;
    }

    private int getDistance(final int x1, final int y1) {
        return (int) (Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2));
    }

}
