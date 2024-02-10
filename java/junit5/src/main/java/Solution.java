import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int longestPalindrome(String s) {

        final Map<Character, Integer> letterCounts = new HashMap<>();

        final char[] charArrOfS = s.toCharArray();

        for (char charOfS : charArrOfS) {
            final int charOfSCount = letterCounts.getOrDefault(charOfS, 0);
            letterCounts.put(charOfS, charOfSCount + 1);
        }

        int length = 0;
        for (int letterCount : letterCounts.values()) {
            if (letterCount < 2) {
                continue;
            }
            if (letterCount % 2 == 0) { // if letterCount is an even number
                length += letterCount;
            } else {
                length += letterCount - 1;
            }
        }

        if (length < s.length()) {
            length += 1;
        }

        return length;


    }


}
