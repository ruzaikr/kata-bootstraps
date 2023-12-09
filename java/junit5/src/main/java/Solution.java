public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        final int maxI = s.length() / 2 - 1;

        final char[] chars = s.toCharArray();

        for (int i = 0; i <= maxI; i++) {
            int j = s.length() - i - 1;

            if (chars[i] != chars[j]) {
                return false;
            }
        }

        return true;
    }

}
