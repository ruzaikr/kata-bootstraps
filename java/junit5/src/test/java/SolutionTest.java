import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForTestKClosest() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("dvdf", 3),
                Arguments.of("abba", 2)
        );
    }


    @ParameterizedTest
    @MethodSource("getArgsForTestKClosest")
    void testKClosest(final String s, final int expectedOutput) {
        final Solution solution = new Solution();

        final int output = solution.lengthOfLongestSubstring(s);

        assertEquals(expectedOutput, output);
    }

}
