import io.vavr.collection.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of(7, new int[][]{{1,2}, {3,4}, {4,6}, {5,1}, {5,3}, {6,5}}, false),
                Arguments.of(5, new int[][]{{1,3}, {1,2}, {3,4}, {2,4},}, true),
                Arguments.of(5, new int[][]{{2,4}, {3,1}, {3,2}, {1,4},}, true),
                Arguments.of(2, new int[][]{{1,0}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgs")
    void testCanFinish(int numCourses, int[][] prerequisites, boolean expectedOutput) {
        Solution solution = new Solution();
        assertEquals(expectedOutput, solution.canFinish(numCourses, prerequisites));
    }

}