class Solution {

    public int getLongestPath(int[][] matrix) {

        int longestPathSize = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int pathSize = dfs(matrix, 1, row, col);
                if (pathSize > longestPathSize) {
                    longestPathSize = pathSize;
                }
            }
        }

        return longestPathSize;

    }

    private int dfs(int[][] matrix, int currentPathSize, int row, int col) {
        int height = matrix[row][col];
        int longestPathSize = currentPathSize;

        int[][] deltas = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        for (int[] delta : deltas) {
            int nextRow = row + delta[0];
            int nextCol = col + delta[1];

            if (!isValid(nextRow, nextCol, height, matrix)) {
                continue;
            }

            int pathSizeAfterTraversal = dfs(matrix, currentPathSize + 1, nextRow, nextCol);

            if (pathSizeAfterTraversal > longestPathSize) {
                longestPathSize = pathSizeAfterTraversal;
            }
        }

        return longestPathSize;

    }

    private boolean isValid(int row, int col, int prevHeight, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length && matrix[row][col] < prevHeight;
    }

}