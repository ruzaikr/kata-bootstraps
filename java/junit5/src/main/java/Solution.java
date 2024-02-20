public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode invertedRightTree = invertTree(root.right);
        TreeNode invertedLeftTree = invertTree(root.left);

        root.left = invertedRightTree;
        root.right = invertedLeftTree;

        return root;

    }


}
