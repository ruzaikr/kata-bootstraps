import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static Stream<Arguments> getArgsForEvalRPN() {
        return Stream.of(
                Arguments.of(new String[]{"9"}, 9),
                Arguments.of(new String[]{"1,2"}, 9)
//                Arguments.of(new String[]{"2","1","+","3","*"}, 9),
//                Arguments.of(new String[]{"4","13","5","/","+"}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForEvalRPN")
    void testEvalRPN(final String[] tokens, final int expectedOutput) {
        final Solution solution = new Solution();

        final int output = solution.evalRPN(tokens);

        assertEquals(expectedOutput, output);
    }

}
