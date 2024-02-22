import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestShortestPalindrome() {
        return Stream.of(
                Arguments.of("aacecaaa", "aaacecaaa"),
                Arguments.of("abcd", "dcbabcd")
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestShortestPalindrome")
    void shortestPalindrome(String s, String expectedShortestPalindrome) {

        Solution solution = new Solution();
        String shortestPalindrome = solution.shortestPalindrome(s);

        assertEquals(expectedShortestPalindrome, shortestPalindrome);

    }

    @Test
    void testIsPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("a"));
    }
}