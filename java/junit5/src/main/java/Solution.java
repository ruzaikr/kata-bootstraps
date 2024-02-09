public class Solution {

    public boolean isBalanced(TreeNode root) {

        return nameItLater(root) != -1;

    }

    private static int nameItLater(TreeNode current) {

        if (current == null) {
            return 0;
        }

        if (current.left == null && current.right == null) {
            return 1;
        }

        int heightLeft = 0;
        int heightRight = 0;
        if (current.left != null) {
            heightLeft = nameItLater(current.left);
            if (heightLeft == -1) {
                return -1;
            }
        }
        if (current.right != null) {
            heightRight = nameItLater(current.right);
            if (heightRight == -1) {
                return -1;
            }
        }

        if (Math.abs(heightLeft - heightRight) > 1) {
            return -1;
        }

        return 1 + Math.max(heightLeft, heightRight);

    }


}
