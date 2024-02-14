import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestKClosest() {
        return Stream.of(
//                Arguments.of(new int[]{1,-1,-1,0}, List.of(List.of(-1,0,1))),
//                Arguments.of(new int[]{0,0,0}, List.of(List.of(0,0,0))),
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, List.of(List.of(-1,-1,2),List.of(-1,0,1)))
        );
    }


    @ParameterizedTest
    @MethodSource("getArgsForTestKClosest")
    void testKClosest(final int[] nums, final List<List<Integer>> expectedTriplets) {
        final Solution solution = new Solution();

        final List<List<Integer>> triplets = solution.threeSum(nums);

        assertEquals(expectedTriplets, triplets);
    }

}
