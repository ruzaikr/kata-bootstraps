import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testIsBalanced() {
        final Solution solution = new Solution();

        ListNode head = new ListNode(3);
        ListNode pos = new ListNode(2);
        head.next = pos;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = pos;

        assertTrue(solution.hasCycle(head));
    }


}
