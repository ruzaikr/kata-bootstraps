import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestCoinChange() {
        return Stream.of(
                Arguments.of(new int[]{2,3,5,0}, new int[]{0,0,0,30}),
                Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6}),
                Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestCoinChange")
    void testCoinChange(final int[] nums, final int[] expectedOutput) {

        final Solution solution = new Solution();

        final int[] output = solution.productExceptSelf(nums);

        assertArrayEquals(expectedOutput, output);

    }

}
