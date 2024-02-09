import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test
    void testLowestCommonAncestor() {

//        final TreeNode p = new TreeNode(
//                2,
//                new TreeNode(0),
//                new TreeNode(
//                        4,
//                        new TreeNode(3),
//                        new TreeNode(5)
//                )
//        );
//
//        final TreeNode q = new TreeNode(
//                8,
//                new TreeNode(7),
//                new TreeNode(9)
//        );
//
//        final TreeNode root = new TreeNode(
//                6,
//                p,
//                q
//        );

        final TreeNode p = new TreeNode(3);

        final TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                p

        );

        final Solution solution = new Solution();

        final TreeNode result = solution.lowestCommonAncestor(root, p, root);

        assertEquals(root, result);

    }

}
