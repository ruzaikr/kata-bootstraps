import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Stream<Arguments> getArgsForTestMaxProfit(){
        return Stream.of(
                // 1: num1, 2: num2, 3: product

                // 2 same positive integers
                Arguments.of(2, 2, 4),

                // 2 different positive integers
                Arguments.of(3, 5, 15),

                // multiply by 1
                Arguments.of(7, 1, 7),

                // multiply by 0
                Arguments.of(7, 0, 0),
                Arguments.of(0, 7, 0),
                Arguments.of(0, 0, 0),

                // multiply 1 positive with 1 negative integer
                Arguments.of(-2, 2, -4),

                Arguments.of(2, -2, -4),

                Arguments.of(-2, -2, 4)

        );
    }

    @ParameterizedTest
    @MethodSource("getArgsForTestMaxProfit")
    void testMultiply(final int num1, final int num2, final int expectedProduct) {

        final int product = Calculator.multiply(num1, num2);
        assertEquals(expectedProduct, product);
    }

}
