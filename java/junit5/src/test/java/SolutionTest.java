import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testIsValidBST() {
        final TreeNode root = new TreeNode(2147483647);

        final Solution solution = new Solution();

        final boolean output = solution.isValidBST(root);

        assertTrue(output);

    }



}
