import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestClimbStairs() {
        return Stream.of(
            Arguments.of(2, 2),
            Arguments.of(3, 3),
            Arguments.of(4, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestClimbStairs")
    void testClimbStairs(int n, int expectedNoOfWays) {

        final Solution solution = new Solution();

        final int noOfWays = solution.climbStairs(n);

        assertEquals(expectedNoOfWays, noOfWays);


    }


}
