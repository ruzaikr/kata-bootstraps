import java.util.*;

class Solution {

    /*
    *
    * 1. Iterate over all cells in the matrix and enqueue all cells containing 0
    * 2. While queue is not empty, dequeue a cell and process its neighbors
    *
    * */

    public int[][] updateMatrix(int[][] mat) {

        int[][] distances = new int[mat.length][mat[0].length];
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        Queue<int[]> queue = new LinkedList<>();

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    queue.add(new int[]{row,col,0});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] rowColDist = queue.remove();
            int row = rowColDist[0];
            int col = rowColDist[1];
            int distance = rowColDist[2];

            if (visited[row][col]) {
                continue;
            }

            visited[row][col] = true;
            distances[row][col] = distance;

            int[][] deltas = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
            for (int[] delta : deltas) {
                int newRow = row+delta[0];
                int newCol = col+delta[1];
                if (isValid(newRow, newCol, mat) && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow,newCol,distance+1});
                }
            }

        }

        return distances;

    }

    private boolean isValid(int row, int col, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length;
    }


}