import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {

    public String shortestPalindrome(String s) {

        if (isPalindrome(s)) {
            return s;
        }

        String remainingS = null;
        for (int i = s.length() - 1; i > 0; i--) {
            if (isPalindrome(s.substring(0, i))) {
                remainingS = s.substring(i);
                break;
            }
        }

        String reversedRemainingS = new StringBuilder(remainingS).reverse().toString();

        return reversedRemainingS + s;

    }

    public boolean isPalindrome(String word) {
        char[] charsOfWord = word.toCharArray();
        int leftPtr = 0;
        int rightPtr = word.length() - 1;

        while (leftPtr < rightPtr) {
            if (charsOfWord[leftPtr] != charsOfWord[rightPtr]) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
    }

}
