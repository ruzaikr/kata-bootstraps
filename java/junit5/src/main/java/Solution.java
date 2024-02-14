import java.util.*;

public class Solution {

    private final Set<String> operands = Set.of("+","-","/","*");

    public int evalRPN(String[] tokens) {

        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        final Stack<String> stack = new Stack<>();

        for (final String token : tokens) {
            if (operands.contains(token)) {
                final String operand2 = stack.pop();
                final String operand1 = stack.pop();
                stack.push(getResult(operand1, operand2, token));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());

    }

    private String getResult(final String operand1, final String operand2, final String operator) {

        final int operand1Int = Integer.parseInt(operand1);
        final int operand2Int = Integer.parseInt(operand2);

        int result = switch (operator) {
            case "+" -> operand1Int + operand2Int;
            case "-" -> operand1Int - operand2Int;
            case "*" -> operand1Int * operand2Int;
            default -> operand1Int / operand2Int;
        };

        return String.valueOf(result);

    }

}
