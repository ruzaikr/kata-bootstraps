import java.util.*;

public class Solution {

    private TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;

        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;

    }
}
