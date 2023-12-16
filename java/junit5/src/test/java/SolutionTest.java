import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testLevelOrder() {

        Solution solution = new Solution();

        int[][] mat = new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };

        int[][] output = solution.updateMatrix(mat);

        int[][] expectedOutput = new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        };

        assertTrue(Arrays.deepEquals(output, expectedOutput));

    }

}
