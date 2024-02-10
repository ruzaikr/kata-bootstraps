import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {


    @Test
    void testLevelOrder() {
        final Solution solution = new Solution();

        final TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        final List<List<Integer>> output = solution.levelOrder(root);

        final List<List<Integer>> expectedOutput = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );

        assertEquals(expectedOutput, output);

    }

}
