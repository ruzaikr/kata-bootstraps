import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestIsAnagram() {
        return Stream.of(
            Arguments.of("a", "a", true),
            Arguments.of("anagram", "nagaram", true),
            Arguments.of("anagram", "nagarama", false),
            Arguments.of("anagram", "nagaxam", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestIsAnagram")
    void testIsAnagram(String s, String t, boolean expectedIsAnagram) {
        final Solution solution = new Solution();
        final boolean isAnagram = solution.isAnagram(s, t);
        assertEquals(expectedIsAnagram, isAnagram);
    }

}
