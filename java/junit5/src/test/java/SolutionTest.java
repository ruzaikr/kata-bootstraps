import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void testMaxDepth() {
        final Solution solution = new Solution();

        final TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);

        final TreeNode invertedTree = solution.invertTree(root);
    }

    @Test
    void testMaxDepth2() {
        final Solution solution = new Solution();

        final TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20, new TreeNode(15), new TreeNode(7)
                )
        );

        final TreeNode invertedTree = solution.invertTree(root);
    }

}
