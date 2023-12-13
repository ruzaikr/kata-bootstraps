import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testReverseList() {

        final ListNode head = new ListNode(
            1, new ListNode(
                2, new ListNode(
                    3, new ListNode(
                        4, new ListNode(
                            5)))));

        final Solution solution = new Solution();

        final ListNode reversedHead = solution.reverseList(head);

        final ListNode expectedReversedHead = new ListNode(
            5, new ListNode(
                4, new ListNode(
                    3, new ListNode(
                        2, new ListNode(
                            1)))));

        assertEquals(expectedReversedHead.val, reversedHead.val);
        assertEquals(expectedReversedHead.next.val, reversedHead.next.val);
        assertEquals(expectedReversedHead.next.next.val, reversedHead.next.next.val);
        assertEquals(expectedReversedHead.next.next.next.val, reversedHead.next.next.next.val);
        assertEquals(expectedReversedHead.next.next.next.next.val, reversedHead.next.next.next.next.val);

    }


}
