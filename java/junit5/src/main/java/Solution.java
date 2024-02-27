import java.util.*;

class Solution {

    /*
    *
    *
    * */


    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        Map<Integer, Node> valToNodeCopy = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        Node nodeCopy = null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            visited.add(currNode);
            Node currNodeCopy = valToNodeCopy.getOrDefault(currNode.val, new Node(currNode.val));
            if (nodeCopy == null) {
                nodeCopy = currNodeCopy;
            }
            List<Node> neighborsCopy = new LinkedList<>();
            for (Node neighbor : currNode.neighbors) {
                Node neighborCopy = valToNodeCopy.getOrDefault(neighbor.val, new Node(neighbor.val));
                valToNodeCopy.put(neighbor.val, neighborCopy);
                neighborsCopy.add(neighborCopy);
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
            }
            currNodeCopy.neighbors = neighborsCopy;
            valToNodeCopy.put(currNode.val, currNodeCopy);
        }

        return nodeCopy;
    }


}