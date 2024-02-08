import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestIsAnagram() {
        return Stream.of(
                Arguments.of(
                        "anagram", "nagaram", true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestIsAnagram")
    void testIsAnagram(final String s, final String t, final boolean expectedResult) {
        final Solution solution = new Solution();
        final boolean result = solution.isAnagram(s, t);

        assertEquals(expectedResult, result);
    }
}
