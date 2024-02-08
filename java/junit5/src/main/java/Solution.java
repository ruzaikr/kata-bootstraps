public class Solution {

    private final String s;

    private final char[] charArrOfS;

    public Solution(final String s) {
        this.s = s;
        this.charArrOfS = s.toCharArray();
    }

    public boolean isPalindrome() {

        if (s.isEmpty()) {
            return false;
        }

        if (s.length() == 1) {
            return true;
        }

        int leftPtr = 0;
        int rightPtr = s.length() - 1;

        do {

            while (leftPtr < rightPtr && !Character.isLetterOrDigit(charArrOfS[leftPtr])) {
                leftPtr += 1;
            }

            while (rightPtr > leftPtr && !Character.isLetterOrDigit(charArrOfS[rightPtr])) {
                rightPtr -= 1;
            }

            if (Character.toLowerCase(charArrOfS[leftPtr]) != Character.toLowerCase(charArrOfS[rightPtr])) {
                return false;
            }

            leftPtr += 1;
            rightPtr -= 1;

        } while (leftPtr < rightPtr);

        return true;
    }

}
