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

    private static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5}, 1, 0),
                Arguments.of(new int[]{1}, 1, 0)
//                Arguments.of(new int[]{4,5,6,7,0,1,2}, 0, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgs")
    void testSearch(int[] rotatedNums, int target, int expectedOutput) {
        Solution solution = new Solution();
        int output = solution.search(rotatedNums, target);
        assertEquals(expectedOutput, output);
    }

}