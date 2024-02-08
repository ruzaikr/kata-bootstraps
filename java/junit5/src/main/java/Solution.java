import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        final Map<Character, Integer> charOccurences = new HashMap<>();

        final char[] charArrOfS = s.toCharArray();

        for (char charOfS : charArrOfS) {
            charOccurences.put(charOfS, charOccurences.getOrDefault(charOfS, 0) + 1);
        }

        final char[] charArrOfT = t.toCharArray();

        for (char charOfT : charArrOfT) {
            final int occurencesOfCharOfT = charOccurences.getOrDefault(charOfT, 0);
            if (occurencesOfCharOfT == 0) {
                return false;
            }
            if (occurencesOfCharOfT == 1) {
                charOccurences.remove(charOfT);
                continue;
            }
            charOccurences.put(charOfT, occurencesOfCharOfT - 1);
        }

        return charOccurences.isEmpty();
    }


}
