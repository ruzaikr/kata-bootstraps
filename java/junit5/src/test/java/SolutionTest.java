import io.vavr.collection.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testCombinationSum() {
        Solution solution = new Solution();
        List<List<Integer>> output = solution.combinationSum(new int[]{2,3,6,7}, 7);
        List<List<Integer>> expected = List.of(
                List.of(2,2,3),
                List.of(7)
        );
        assertArrayEquals(expected.toArray(), output.toArray());
    }


}