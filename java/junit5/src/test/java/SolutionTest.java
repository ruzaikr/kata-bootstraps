import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestSearch() {
        return Stream.of(
            Arguments.of(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2, new int[][]{{2,2,2},{2,2,0},{2,0,1}}),
            Arguments.of(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0, new int[][]{{0,0,0},{0,0,0}})
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestSearch")
    void testSearch(int[][] image, int sr, int sc, int color, int[][] expectedColoredImage) {
        final Solution solution = new Solution();
        final int[][] coloredImage = solution.floodFill(image, sr, sc, color);
        assertTrue(Arrays.deepEquals(expectedColoredImage, coloredImage));
    }

}
