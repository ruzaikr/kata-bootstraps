import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestLongestPalindrome() {
        return Stream.of(
            Arguments.of("abccccdd", 7),
            Arguments.of("a", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestLongestPalindrome")
    void testLongestPalindrome(String s, int expectedLength) {

        final Solution solution = new Solution();

        final int length = solution.longestPalindrome(s);

        assertEquals(expectedLength, length);


    }


}
