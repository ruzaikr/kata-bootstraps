public class MinStack {

    private ListNode tail;

    private ListNode min;

    public MinStack() {

    }

    public void push(int val) {
        final ListNode newNode = new ListNode(val);

        if (tail == null) {
            tail = newNode;
            min = newNode;
            return;
        }

        newNode.setPrev(tail);
        tail = newNode;
        if (tail.getVal() < min.getVal()) {
            tail.setMinPrev(min);
            min = tail;
        }

    }

    public void pop() {
        if (tail == min) {
            min = min.getMinPrev();
        }
        tail = tail.getPrev();
    }

    public int top() {
        return tail.getVal();
    }

    public int getMin() {
        return min.getVal();
    }

}
