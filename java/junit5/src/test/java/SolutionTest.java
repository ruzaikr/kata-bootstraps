import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static Stream<Arguments> getArgsForTestMajorityElement() {
        return Stream.of(
                Arguments.of("11", "1", "100")
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMajorityElement")
    void testMajorityElement(final String a, final String b, final String expectedSum) {
        final Solution solution = new Solution();
        final String sum = solution.addBinary(a, b);
        assertEquals(expectedSum, sum);
    }

    @Test
    void testScratchpad() {
        final char myCharOne = '1';
        final char myCharZero = '0';

        final int myIntOne = myCharOne - '0';
        final int myIntZero = myCharZero;

        System.out.println(myIntOne);
        System.out.println(myIntZero);
    }
}
