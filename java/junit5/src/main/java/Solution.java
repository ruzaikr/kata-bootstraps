public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        TreeNode current = root;

        while (true) {

            if (p.val == current.val || q.val == current.val) {
                return current;
            }

            if (p.val < current.val && q.val > current.val) {
                return current;
            }

            if (p.val < current.val) {
                current = current.left;
                continue;
            }

            if (q.val > current.val) {
                current = current.right;
            }

        }

    }


}
