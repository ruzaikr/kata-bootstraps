//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//
//class MinStack {
//
//    Stack<Integer> stack;
//    List<Integer> minLL;
//    int min;
//    boolean doesMinExist;
//
//    public MinStack() {
//
//        stack = new Stack<>();
//        minLL = new LinkedList<>();
//
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (!doesMinExist || val <= min) {
//            min = val;
//            minLL.add(val);
//        }
//        if (!doesMinExist) {
//            doesMinExist = true;
//        }
//    }
//
//    public void pop() {
//        if (stack.isEmpty()) {
//            return;
//        }
//        int valueAtTop = stack.pop();
//        if (stack.isEmpty()) {
//            min = 0;
//            doesMinExist = false;
//        } else {
//            if (valueAtTop == min) {
//                minLL.removeLast();
//                min = minLL.getLast();
//            }
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return min;
//    }
//}