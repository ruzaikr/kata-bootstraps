import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack;

    Stack<Integer> tempStack;

    public MyQueue() {
        this.stack = new Stack<>();
        this.tempStack = new Stack<>();
    }

    public void push(int x) {
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        stack.push(x);

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
