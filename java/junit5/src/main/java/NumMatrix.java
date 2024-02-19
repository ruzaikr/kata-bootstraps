public class NumMatrix {

    private final int noOfRows;

    private final int noOfCols;

    private final int[][] prefixSumMatrix;

    public NumMatrix(int[][] matrix) {

        noOfRows = matrix.length;
        noOfCols = matrix[0].length;

        prefixSumMatrix = new int[noOfRows][noOfCols];

        for (int row = 0; row < matrix.length; row++) {

            final int[] prefixSumRow = new int[noOfCols];

            for (int col = 0; col < matrix[0].length; col++) {
                int prefixSumRowAddend = 0;
                if (col > 0) {
                    prefixSumRowAddend = prefixSumRow[col-1];
                }
                prefixSumRow[col] = matrix[row][col] + prefixSumRowAddend;

                final int up = isWithinBounds(row - 1, col) ? prefixSumMatrix[row-1][col] : 0;
                final int left = isWithinBounds(row, col -1) ? prefixSumRow[col-1] : 0;

                prefixSumMatrix[row][col] = matrix[row][col] + up + left;

            }
        }

    }

    private boolean isWithinBounds(final int row, final int col) {
        return row >= 0 && row <= noOfRows && col >= 0 && col <= noOfCols;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int x = prefixSumMatrix[row2][col2];
        int y1 = 0;
        int y2 = 0;
        int z = 0;

        if (row1 > 0) {
            y1 = prefixSumMatrix[row1-1][col2];
        }

        if (col1 > 0) {
            y2 = prefixSumMatrix[row2][col1-1];
        }

        if (row1 > 0 && col1 > 0) {
            z = prefixSumMatrix[row1-1][col1-1];
        }

        return x - y1 - y2 + z;

    }


}
