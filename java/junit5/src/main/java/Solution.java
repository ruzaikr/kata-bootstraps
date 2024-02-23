public class Solution {

    public int maximalRectangle(char[][] matrix) {

        int[][] prefixSums = getPrefixSums(matrix);

        int maxSum = 0;

        for (int row1 = 0; row1 < matrix.length; row1++) {
            for (int col1 = 0; col1 < matrix[0].length; col1++) {
                for (int row2 = 0; row2 < matrix.length; row2++) {
                    for (int col2 = 0; col2 < matrix[0].length; col2++) {

                       int sum = getSum(prefixSums, row1, col1, row2, col2);
                       int area = getArea(row1, col1, row2, col2);
                       if (sum == area && sum > maxSum) {
                           maxSum = sum;
                       }

                    }

                }

            }

        }

        return maxSum;

    }

    public int getArea(int row1, int col1, int row2, int col2) {
        int length = Math.abs(row1-row2) + 1;
        int width = Math.abs(col1-col2) + 1;
        return length*width;
    }

    public int getSum(int[][] prefixSums, int row1, int col1, int row2, int col2) {
        int bottomRight = prefixSums[row2][col2];
        int top = 0;
        int left = 0;
        int topLeft = 0;

        if (row1 > 0) {
            top = prefixSums[row1-1][col2];
        }

        if (col1 > 0) {
            left = prefixSums[row2][col1-1];
        }

        if (row1 > 0 && col1 > 0) {
            topLeft = prefixSums[row1-1][col1-1];
        }

        return bottomRight - top - left + topLeft;
    }

    public int[][] getPrefixSums(char[][] matrix) {
        int[][] prefixSums = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {

            int[] prefixSumsRow = new int[matrix[0].length];
            prefixSumsRow[0] = matrix[row][0] - '0';
            for (int col = 0; col < matrix[0].length; col++) {
                int currentVal = matrix[row][col] - '0';
                int up = 0;
                int left = 0;

                if (row > 0) {
                    up = prefixSums[row-1][col];
                }

                if (col > 0) {
                    left = prefixSumsRow[col-1];
                    prefixSumsRow[col] = left + currentVal;
                }

                prefixSums[row][col] = currentVal + up + left;
            }

        }

        return prefixSums;
    }

}
