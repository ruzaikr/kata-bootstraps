import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestMajorityElement() {
        return Stream.of(
                Arguments.of(new int[]{3,2,3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMajorityElement")
    void testMajorityElement(final int[] nums, final int expectedOutput) {
        final Solution solution = new Solution();
        final int output = solution.majorityElement(nums);
        assertEquals(output, expectedOutput);
    }
}
