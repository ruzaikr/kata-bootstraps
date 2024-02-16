public class Solution {

    public boolean isValidBST(TreeNode root) {


        return dfs(root, null, null);

    }

    private boolean dfs(TreeNode root, Integer lowerBound, Integer upperBound) {
        if (root == null) {
            return true;
        }

        if (lowerBound != null && root.val <= lowerBound) {
            return false;
        }

        if (upperBound != null && root.val >= upperBound) {
            return false;
        }

        return dfs(root.left, lowerBound, root.val) && dfs(root.right, root.val, upperBound);
    }

}
