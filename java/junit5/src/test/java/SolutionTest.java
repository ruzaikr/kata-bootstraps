import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestMaxProfit(){
        return Stream.of(
            Arguments.of(new int[]{}, 0),
            Arguments.of(new int[]{1}, 0),
            Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMaxProfit")
    void testMaxProfit(final int[] input, final int expectedMaxProfit) {
        final Solution solution = new Solution();
        final int maxProfit = solution.maxProfit(input);
        assertEquals(maxProfit, expectedMaxProfit);
    }

}
