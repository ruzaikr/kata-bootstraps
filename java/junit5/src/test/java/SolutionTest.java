import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestMaxProfit(){
        return Stream.of(
            Arguments.of(" ", true),
            Arguments.of("b", true),
            Arguments.of("tot", true),
            Arguments.of("toot", true),
            Arguments.of("A man, a plan, a canal: Panama", true),
            Arguments.of("race a car", false),
            Arguments.of("0P", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMaxProfit")
    void testMaxProfit(final String input, final boolean expectedIsPalindrome) {
        final Solution solution = new Solution();
        final boolean isPalindrome = solution.isPalindrome(input);
        assertEquals(isPalindrome, expectedIsPalindrome);
    }

}
