public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left != null || root.right != null) {
            final TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        if (root.left != null) {
            root.left = invertTree(root.left);
        }
        if (root.right != null) {
            root.right = invertTree(root.right);
        }

        return root;
    }

}
