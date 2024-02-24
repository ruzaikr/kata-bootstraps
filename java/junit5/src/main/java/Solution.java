class Solution {

    public int longestIncreasingPath(int[][] matrix) {

        if (matrix.length == 1 && matrix[0].length == 1) {
            return matrix[0][0];
        }

        int[][] cache = new int[matrix.length][matrix[0].length];
        int longestPathSize = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int pathSize = dfs(matrix, row, col, cache);
                if (pathSize > longestPathSize) {
                    longestPathSize = pathSize;
                }
            }
        }

        return longestPathSize;

    }

    private int dfs(int[][] matrix, int row, int col, int[][] cache) {

        if (cache[row][col] > 0) {
            return cache[row][col];
        }

        int height = matrix[row][col];

        int[][] deltas = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        for (int[] delta : deltas) {
            int nextRow = row + delta[0];
            int nextCol = col + delta[1];

            if (!isValid(nextRow, nextCol, height, matrix)) {
                continue;
            }

            int pathSizeOfNextRowNextCol = dfs(matrix, nextRow, nextCol, cache);

            if (pathSizeOfNextRowNextCol > cache[row][col]) {
                cache[row][col] = pathSizeOfNextRowNextCol;
            }
        }

        cache[row][col] = cache[row][col] + 1;
        return cache[row][col];

    }

    private boolean isValid(int row, int col, int prevHeight, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length && matrix[row][col] > prevHeight;
    }

}