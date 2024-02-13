import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestKClosest() {
        return Stream.of(
                Arguments.of(new int[][]{{1,3},{-2,2}}, 1, new int[][]{{-2,2}}),
                Arguments.of(new int[][]{{3,3},{5,-1},{-2,4}}, 2, new int[][]{{3,3},{-2,4}})
        );
    }


    @ParameterizedTest
    @MethodSource("getArgsForTestKClosest")
    void testKClosest(final int[][] points, final int k, final int[][] ExpectedKClosestPoints) {
        final Solution solution = new Solution();

        final int[][] kClosestPoints = solution.kClosest(points, k);

        assertArrayEquals(ExpectedKClosestPoints, kClosestPoints);
    }

}
