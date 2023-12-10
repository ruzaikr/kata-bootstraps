import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestSearch() {
        return Stream.of(
            Arguments.of(new int[]{-1,0,3,5,9,12}, 9, true),
            Arguments.of(new int[]{1}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestSearch")
    void testSearch(int[] nums, int target, boolean expected) {
        final Solution solution = new Solution();
        final boolean exists = solution.search(nums, target);
        assertEquals(expected, exists);
    }

}
