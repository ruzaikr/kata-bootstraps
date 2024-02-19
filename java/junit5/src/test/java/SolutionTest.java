import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestSumRegion() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1,0,1},
                        {0,-2,3}
                }, 2, 2),
                Arguments.of(new int[][] {
                        {2,2,-1}
                }, 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestSumRegion")
    void testSumRegion(final int[][] matrix, final int k, final int expectedSum) {

        final Solution solution = new Solution();

        final int sum = solution.maxSumSubmatrix(matrix, k);

        assertEquals(expectedSum, sum);

    }

}
