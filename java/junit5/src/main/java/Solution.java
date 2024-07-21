import java.util.Stack;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list2.val < list1.val) {
            ListNode temp = list2;
            list2 = list1;
            list1 = temp;
        }

        ListNode curr = list1;
        ListNode detached = list2;

        while (curr.next != null) {
            if (curr.next.val > detached.val) {
                ListNode temp = curr.next;
                curr.next = detached;
                detached = temp;
            }
                curr = curr.next;

        }

        curr.next = detached;

        return list1;

    }
}
