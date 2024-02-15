import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForEvalRPN() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1,0}}, true),
                Arguments.of(2, new int[][]{{1,0},{0,1}}, false),
                Arguments.of(2, new int[][]{{1,4},{2,4},{3,1},{2,1}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForEvalRPN")
    void testEvalRPN(final int numCourses, final int[][] prereqs, final boolean expectedOutput) {
        final Solution solution = new Solution();

        final boolean output = solution.canFinish(numCourses, prereqs);

        assertEquals(expectedOutput, output);
    }

}
