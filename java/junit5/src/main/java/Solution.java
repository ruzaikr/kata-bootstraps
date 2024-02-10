import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        final Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        final List<List<Integer>> output = new LinkedList<>();

        while (!queue.isEmpty()) {

            final List<Integer> level = new LinkedList<>();
            final int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                final TreeNode current = queue.remove();
                level.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (!level.isEmpty()) {
                output.add(level);
            }
        }

        return output;


    }


}
