import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> result = new ArrayList<>();

        while (!q.isEmpty()) {

            int qSize = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                TreeNode current = q.remove();
                level.add(current.val);

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }


        }

        return result;

    }

}
