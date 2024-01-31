import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestIsValidParantheses() {
        return Stream.of(
            Arguments.of("((", false),
            Arguments.of("()", true),
            Arguments.of(")", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestIsValidParantheses")
    void testIsValidParantheses(final String s, final boolean expectedResult) {

        final Solution solution = new Solution();

        final boolean result = solution.IsValid(s);

        assertEquals(expectedResult, result);

    }
}
