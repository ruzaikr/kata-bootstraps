import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public int[][] updateMatrix(int[][] mat) {

        final Queue<int[]> queue = new LinkedList<>();

        final boolean[][] visited = new boolean[mat.length][mat[0].length];
        final int[][] distances = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                    // no need to update `distances` because all values in `distances` are 0 after initialization
                    queue.add(new int[]{i,j});
                }
            }
        }

        while (!queue.isEmpty()) {
            final int[] currentIJ = queue.remove();
            final int currentI = currentIJ[0];
            final int currentJ = currentIJ[1];

            final int distanceIJ = distances[currentI][currentJ];

            final int[][] addendsToIJ = new int[][]{
                    {0, 1},
                    {1, 0},
                    {0, -1},
                    {-1, 0}
            };

            for (int[] addendToIJ : addendsToIJ) {
                final int newI = currentI + addendToIJ[0];
                final int newJ = currentJ + addendToIJ[1];

                if (isIJWithinBounds(newI, newJ, mat) && !visited[newI][newJ]) {
                    visited[newI][newJ] = true;
                    distances[newI][newJ] = distanceIJ + 1;
                    queue.add(new int[]{newI, newJ});
                }
            }


        }

        return distances;

    }

    private boolean isIJWithinBounds(final int i, final int j, final int[][] mat) {
        return i >= 0 && i < mat.length && j >= 0 && j < mat[i].length;
    }



}
