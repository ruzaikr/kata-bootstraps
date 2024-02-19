import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumMatrixTest {

    @Test
    void testSumRegion() {
        final int[][] matrix = new int[][]{
                {3,0,1,4,2},
                {5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}};

        final NumMatrix obj = new NumMatrix(matrix);
        final int sum1 = obj.sumRegion(2,1,4,3);
        final int sum2 = obj.sumRegion(1,1,2,2);
        final int sum3 = obj.sumRegion(1,2,2,4);
        final int sum4 = obj.sumRegion(0,0,2,1);

        assertEquals(8, sum1);
        assertEquals(11, sum2);
        assertEquals(12, sum3);
        assertEquals(17, sum4);
    }

}
