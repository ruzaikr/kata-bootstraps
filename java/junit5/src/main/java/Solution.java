import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }

        final char[] sChars = s.toCharArray();

        final Map<Character, Integer> charOccurrences = new HashMap<>();

        for (char sChar : sChars) {
            charOccurrences.put(sChar, charOccurrences.getOrDefault(sChar, 0) + 1);
        }

        final char[] tChars = t.toCharArray();

        for (char tChar : tChars) {
            final int tCharOccurences = charOccurrences.getOrDefault(tChar, 0);

            if (tCharOccurences == 0) {
                return false;
            }

            if (tCharOccurences == 1) {
                charOccurrences.remove(tChar);
            } else {
                charOccurrences.put(tChar, tCharOccurences - 1);
            }
        }

        return charOccurrences.isEmpty();
    }

}
