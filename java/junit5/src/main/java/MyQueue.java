import java.util.Stack;

class MyQueue {

      private final Stack<Integer> stack;

      public MyQueue() {
            stack = new Stack<>();
      }

      public void push(int x) {
            Stack<Integer> tempStack = new Stack<>();
            while (!stack.empty()) {
                  tempStack.push(stack.pop());
            }
            stack.push(x);
            while (!tempStack.empty()) {
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
            return stack.empty();
      }
}