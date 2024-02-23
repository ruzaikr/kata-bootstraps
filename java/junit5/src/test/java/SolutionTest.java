import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {6,1,2},
                        {1,4,3}
                }, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgs")
    void testMaximalRectangle(int[][] matrix, int expectedLongestPathSize) {
        Solution solution = new Solution();
        int longestPathSize = solution.getLongestPath(matrix);
        assertEquals(expectedLongestPathSize, longestPathSize);
    }

}