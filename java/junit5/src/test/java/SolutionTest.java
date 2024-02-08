import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestIsPalindrome() {
        return Stream.of(
                Arguments.of("0P", false),
                Arguments.of(",,,,,", true),
                Arguments.of("A ma", true),
                Arguments.of("A man, a plan, a canal: Panama", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestIsPalindrome")
    void testIsPalindrome(final String s, final boolean expectedResult) {
        final Solution solution = new Solution(s);
        final boolean result = solution.isPalindrome();
        assertEquals(expectedResult, result);
    }
}
