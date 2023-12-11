import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testLCA() {
        final Solution solution = new Solution();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);


        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(9);

        final TreeNode lca = solution.lowestCommonAncestor(root, p, q);

        assertEquals(8, lca.val);
    }

    @Test
    void testLCAWherePIsDescendantOfItself() {
        final Solution solution = new Solution();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);


        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        final TreeNode lca = solution.lowestCommonAncestor(root, p, q);

        assertEquals(2, lca.val);
    }

}
