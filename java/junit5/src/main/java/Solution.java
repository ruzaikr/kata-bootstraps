import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final Map<Node, Node> origToClone = new HashMap<>();

    public Node cloneGraph(Node node) {

        if (node == null || node.neighbors == null) {
            return node;
        }

        if (origToClone.containsKey(node)) {
            return origToClone.get(node);
        }

        final Node clone = new Node(node.val);
        origToClone.put(node, clone);
        for (final Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;

    }

}
