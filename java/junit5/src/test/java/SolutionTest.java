import io.vavr.collection.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLevelOrder() {
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node = new Node(1);
        Node node4 = new Node(4);

        node.neighbors = List.of(node2, node4);
        node2.neighbors = List.of(node, node3);
        node3.neighbors = List.of(node2, node4);
        node4.neighbors = List.of(node, node3);

        Solution solution = new Solution();
        Node nodeCopy = solution.cloneGraph(node);
        assertNotEquals(node, nodeCopy);


    }


}