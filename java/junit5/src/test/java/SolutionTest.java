import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testLevelOrder() {

        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> output = solution.levelOrder(root);

        List<List<Integer>> expectedOutput = List.of(
            List.of(3),
            List.of(9, 20),
            List.of(15, 7)
        );

        assertEquals(expectedOutput, output);

    }


}
