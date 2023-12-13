public class Solution {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        if (head.next == null) {
            return head;
        }

        ListNode current = head.next;
        head.next = null;
        ListNode previous = head;
        while (current != null) {
            final ListNode nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }

        return previous;

    }

}
