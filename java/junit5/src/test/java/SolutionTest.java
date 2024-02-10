import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestInsert() {

        return Stream.of(
                Arguments.of(new int[][]{ {1,3}, {6,9} }, new int[]{2,5}, new int[][]{ {1,5}, {6,9} })
        );

    }

    @ParameterizedTest
    @MethodSource("getArgsForTestInsert")
    void testInsert(final int[][] intervals, final int[] newInterval, final int[][] expectedOutput) {

        final Solution solution = new Solution();

        final int[][] output = solution.insert(intervals, newInterval);

        assertEquals(expectedOutput, output);

    }

}
