import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public int numIslands(char[][] grid) {

        int numOfIslands = 0;

        final Set<String> coordsOfVisited1s = new HashSet<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] != '1' || coordsOfVisited1s.contains(getCoords(row, col))) {
                    continue;
                }

                coordsOfVisited1s.add(row + "," + col);

                final Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{row, col});
                while (!queue.isEmpty()) {
                    final int[] currentCoords = queue.remove();

                    final int[][] deltas = new int[][]{
                            {0, 1},
                            {1, 0},
                            {0, -1},
                            {-1, 0}
                    };

                    for (int[] delta : deltas) {
                        int newRow = currentCoords[0] + delta[0];
                        int newCol = currentCoords[1] + delta[1];
                        if (!coordsOfVisited1s.contains(getCoords(newRow, newCol)) && isCoordsWithinBounds(newRow, newCol, grid) && grid[newRow][newCol] == '1') {
                            coordsOfVisited1s.add(newRow + "," + newCol);
                            queue.add(new int[]{newRow, newCol});
                        }
                    }

                }

                numOfIslands++;

            }
        }

        return numOfIslands;

    }

    private boolean isCoordsWithinBounds(final int row, final int col, final char[][] grid) {
        return row >=0 && row < grid.length && col >=0 && col < grid[0].length;
    }

    private String getCoords(final int row, final int col) {
        return row + "," + col;
    }

}
