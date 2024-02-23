import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}
                }, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgs")
    void testMaximalRectangle(char[][] matrix, int expectedOutput) {
        Solution solution = new Solution();
        int output = solution.maximalRectangle(matrix);
        assertEquals(expectedOutput, output);
    }

}