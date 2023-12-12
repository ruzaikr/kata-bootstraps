import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestFib() {
        return Stream.of(
            Arguments.of(0, 0),
            Arguments.of(1, 1),
            Arguments.of(4, 3),
            Arguments.of(8, 21),
            Arguments.of(6, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestFib")
    void testFib(int input, int expectedFib) {

        final Solution solution = new Solution();

        final int fib = solution.fib(input);

        assertEquals(expectedFib, fib);


    }


}
