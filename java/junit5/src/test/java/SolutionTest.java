import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestMergeSortedArray() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3, new int[]{1,2,2,3,5,6})
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMergeSortedArray")
    void testMergeSortedArray(final int[] nums1, final int m, final int[] nums2, final int n, final int[] mergedArray) {
        final Solution solution = new Solution();

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(mergedArray, nums1);
    }

}
