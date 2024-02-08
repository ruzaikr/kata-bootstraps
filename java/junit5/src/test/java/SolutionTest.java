import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestIsAnagram() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1,0,3,5,9,12}, 9, 4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestIsAnagram")
    void testIsAnagram(final int[] nums, final int target, final int expectedResult) {
        final Solution solution = new Solution();
        final int result = solution.search(nums, target);

        assertEquals(expectedResult, result);
    }
}
