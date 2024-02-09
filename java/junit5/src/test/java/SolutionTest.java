import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionTest {


    @Test
    void testIsBalanced() {
        final TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        final Solution solution = new Solution();

        final boolean result = solution.isBalanced(root);

        assertTrue(result);
    }

}
