import java.util.*;

public class Solution {

    private Set<Character> alphanumericChars = new HashSet<>(Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));

    public boolean isPalindrome(String s) {

        List<Character> alphanumericS = new LinkedList<>();

        for (char c : s.toCharArray()) {
            c = Character.toLowerCase(c);
            if (alphanumericChars.contains(c)) {
                alphanumericS.add(c);
            }
        }

        int leftPtr = 0;
        int rightPtr = alphanumericS.size() - 1;

        while (leftPtr < rightPtr) {
            if (!alphanumericS.get(leftPtr).equals(alphanumericS.get(rightPtr))) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }

        return true;

    }
}
