import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestUpdateMatrix() {
        return Stream.of(
                Arguments.of(new int[][]{{0,0,0},{0,1,0},{0,0,0}}, new int[][]{{0,0,0},{0,1,0},{0,0,0}}),
                Arguments.of(new int[][]{{0,0,0},{0,1,0},{1,1,1}}, new int[][]{{0,0,0},{0,1,0},{1,2,1}})
        );
    }


    @ParameterizedTest
    @MethodSource("getArgsForTestUpdateMatrix")
    void testUpdateMatrix(final int[][] mat, final int[][] expectedUpdatedMat) {
        final Solution solution = new Solution();

        final int[][] updatedMat = solution.updateMatrix(mat);

        assertArrayEquals(expectedUpdatedMat, updatedMat);
    }

    @Test
    void testPlayground() {
        boolean[][] myMatrix = new boolean[3][3];

        System.out.println(myMatrix[1][1]);
    }

}
