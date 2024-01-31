import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestTwoSum() {
        return Stream.of(
//            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestTwoSum")
    void testTwoSum(int[] nums, int target, int[] expectedResult) {

        final Solution solution = new Solution();

        final int[] result = solution.TwoSum(nums, target);

        assertArrayEquals(expectedResult, result);

    }
}
