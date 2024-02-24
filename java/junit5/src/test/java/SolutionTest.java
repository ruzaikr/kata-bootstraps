import io.vavr.collection.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testVerticalTraversal() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7))
        );

        List<List<Integer>> output = new Solution().verticalTraversal(root);

        assertEquals(List.of(List.of(4), List.of(2), List.of(1,5,6), List.of(3), List.of(7)), output);
    }

}