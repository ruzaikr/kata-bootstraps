public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare;

        if (head.next == null || head.next.next == null) {
            return false;
        } else {
            hare = head.next.next;
        }


        while (true) {

            if (hare == tortoise) {
                return true;
            }

            tortoise = tortoise.next;

            if (hare.next == null || hare.next.next == null) {
                return false;
            }

            hare = hare.next.next;
        }

    }

}
