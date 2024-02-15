import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestCoinChange() {
        return Stream.of(
                Arguments.of(new int[]{2}, 4, 2),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1,2,5}, 11, 3),
                Arguments.of(new int[]{1,2,5}, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestCoinChange")
    void testCoinChange(final int[] coins, final int amount, final int expectedOutput) {

        final Solution solution = new Solution();

        final int output = solution.coinChange(coins, amount);

        assertEquals(expectedOutput, output);

    }

}
