import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> getArgsForTestCanConstruct() {
        return Stream.of(
            Arguments.of("aa", "aab", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestCanConstruct")
    void testCanConstruct(String ransomNote, String magazine, boolean expectedCanConstruct) {

        final Solution solution = new Solution();

        final boolean canConstruct = solution.canConstruct(ransomNote, magazine);

        assertEquals(expectedCanConstruct, canConstruct);


    }


}
