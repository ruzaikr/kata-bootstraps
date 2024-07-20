import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isCloseBracket(c)) {
                if (stack.isEmpty() || !stack.peek().equals(getOpenBracket(c))) {
                    return false;
                }
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }

    private boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private char getOpenBracket(char c) {
        if (c == ')') {
            return '(';
        }

        if (c == '}') {
            return '{';
        }

        if (c == ']') {
            return '[';
        }

        return ' ';
    }
}
