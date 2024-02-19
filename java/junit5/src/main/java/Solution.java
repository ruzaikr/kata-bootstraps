public class Solution {


    public int maxSumSubmatrix(int[][] matrix, int k) {

        final int noOfRows = matrix.length;
        final int noOfCols = matrix[0].length;

        final int[][] prefixSumMatrix = new int[noOfRows][noOfCols];

        for (int row = 0; row < noOfRows; row++) {

            final int[] prefixSumRow = new int[noOfCols];

            for (int col = 0; col < noOfCols; col++) {

                int up = 0;
                int left = 0;

                if (row > 0) {
                    up = prefixSumMatrix[row-1][col];
                }

                if (col > 0) {
                    left = prefixSumRow[col-1];
                }

                final int matrixVal = matrix[row][col];

                prefixSumRow[col] = left + matrixVal;

                prefixSumMatrix[row][col] = matrixVal + up + left;

            }
        }

        Integer maxSum = null;

        // Calculate sum of all rectangles
        for (int row1 = 0; row1 < noOfRows; row1++) {
            for (int col1 = 0; col1 < noOfCols; col1++) {
                for (int row2 = row1; row2 < noOfRows; row2++) {
                    for (int col2 = col1; col2 < noOfCols; col2++) {
                        final int sum = getSum(prefixSumMatrix, row1, col1, row2, col2);
                        if (sum <= k) {
                            if (maxSum == null) {
                                maxSum = sum;
                            } else {
                                maxSum = Math.max(maxSum, sum);
                            }
                        }
                    }
                }
            }
        }

        return maxSum;

    }

    private int getSum(final int[][] prefixSumMatrix, final int row1, final int col1, final int row2, final int col2) {
        final int bottomRight = prefixSumMatrix[row2][col2];
        int topLeft = 0;
        int up = 0;
        int left = 0;

        if (row1 > 0 && col1 > 0) {
            topLeft = prefixSumMatrix[row1-1][col1-1];
        }

        if (row1 > 0) {
            up = prefixSumMatrix[row1-1][col2];
        }

        if (col1 > 0) {
            left = prefixSumMatrix[row2][col1-1];
        }

        return bottomRight - up - left + topLeft;
    }


}
