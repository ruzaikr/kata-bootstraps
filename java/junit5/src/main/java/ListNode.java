public class ListNode {

    private int val;

    private ListNode prev;

    private ListNode minPrev;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode prev) {
        this.val = val;
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getMinPrev() {
        return minPrev;
    }

    public void setMinPrev(ListNode minPrev) {
        this.minPrev = minPrev;
    }

}
