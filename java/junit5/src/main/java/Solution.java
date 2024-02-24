import java.util.*;

class Solution {

    /*

    1. Starting from the root, traverse the entire tree using dfs.
    2. During the dfs, insert the treeNode into a hashMap where the key is the x-axis value of the treeNode.
    3. To get the x-axis value of the treeNode, we need to pass an x-axis value from the caller of dfs.

    4. Iterate over the keys of the hashMap


     */

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Map<Integer, Map<Integer, List<Integer>>> xToYToVals = new HashMap<>();

        dfs(root, 0, 0, xToYToVals);

        List<Integer> sortedKeySetX = xToYToVals.keySet().stream().sorted().toList();
        List<List<Integer>> result = new LinkedList<>();

        for (int x : sortedKeySetX) {

            Map<Integer, List<Integer>> yToVals = xToYToVals.get(x);

            List<Integer> sortedKeySetY = yToVals.keySet().stream().sorted().toList();

            List<Integer> nameItLater = new LinkedList<>();

            for (int y : sortedKeySetY) {
                List<Integer> vals = yToVals.get(y);
                if (vals.size() == 1) {
                    nameItLater.add(vals.get(0));
                } else {
                    nameItLater.addAll(vals.stream().sorted().toList());
                }
            }

            result.add(nameItLater);

        }

        return result;

    }

    private void dfs(TreeNode treeNode, int x, int y, Map<Integer, Map<Integer, List<Integer>>> xToYToVals) {
        if (treeNode == null) {
            return;
        }

        Map<Integer, List<Integer>> yToVals = xToYToVals.getOrDefault(x, new HashMap<>());
        List<Integer> vals = yToVals.getOrDefault(y, new LinkedList<>());
        vals.add(treeNode.val);
        yToVals.put(y, vals);
        xToYToVals.put(x, yToVals);

        dfs(treeNode.left, x - 1, y + 1, xToYToVals);
        dfs(treeNode.right, x + 1, y + 1, xToYToVals);
    }

}