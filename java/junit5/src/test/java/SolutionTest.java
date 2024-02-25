import io.vavr.collection.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMatrix() {
        int[][] matrix = new int[][]{
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] output = new Solution().updateMatrix(matrix);

        int[][] expectedOutput = new int[][]{
                {0,0,0},
                {0,1,0},
                {1,2,1}
        };

        assertArrayEquals(expectedOutput, output);
    }

}