import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int longestPalindrome(String s) {

        if (s.length() == 1) {
            return 1;
        }

        Map<Character, Integer> occurrences = new HashMap<>();

        char[] charsS = s.toCharArray();
        for (char charS : charsS) {
            int occurrencesOfCharS = occurrences.getOrDefault(charS, 0);
            occurrences.put(charS, occurrencesOfCharS + 1);
        }

        int length = 0;
        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            int occurrencesOfCharS = entry.getValue();

            if (isOdd(occurrencesOfCharS)) {
                flag = true;
            }

            if (occurrencesOfCharS > 1) {

                if (isOdd(occurrencesOfCharS)) {
                    length += occurrencesOfCharS - 1;
                }else {
                    length += occurrencesOfCharS;
                }

            }
        }

        if (flag) {
            length = length + 1;
        }

        return length;

    }

    private boolean isOdd(int n) {
        return (n & 1) != 0;
    }

}
