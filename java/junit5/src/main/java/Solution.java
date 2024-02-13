import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        int longestLength = 0;

        final Set<Character> subString = new HashSet<>();

        final char[] charsOfS = s.toCharArray();

        int leftPtr = 0;

        for (int rightPtr = 0; rightPtr < s.length(); rightPtr++) {

            while (subString.contains(charsOfS[rightPtr])) {
                subString.remove(charsOfS[leftPtr]);
                leftPtr++;
            }

            subString.add(charsOfS[rightPtr]);

            if (subString.size() > longestLength) {
                longestLength = subString.size();
            }
        }

        return longestLength;

    }

}
