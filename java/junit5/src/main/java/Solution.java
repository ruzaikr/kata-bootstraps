import java.util.Map;
import java.util.Stack;

public class Solution {

    private Map<Character, Character> closeToOpen = Map.of(
        ')', '(',
        '}', '{',
        ']', '['
    );

    public boolean IsValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        final char[] charArrayOfS = s.toCharArray();

        final Stack<Character> stackOfOpenParantheses = new Stack<>();

        for (char charArrayOf : charArrayOfS) {
            if (isOpenParantheses(charArrayOf)) {
                stackOfOpenParantheses.push(charArrayOf);
                continue;
            }

            if (stackOfOpenParantheses.isEmpty()) {
                return false;
            }

            final char topOfStack = stackOfOpenParantheses.pop();

            if (topOfStack != closeToOpen.getOrDefault(charArrayOf, 'x')) {
                return false;
            }
        }

        return stackOfOpenParantheses.isEmpty();

    }

    private static boolean isOpenParantheses(char parantheses) {
        return parantheses == '(' || parantheses == '{' || parantheses == '[';
    }
}
