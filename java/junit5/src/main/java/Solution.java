public class Solution {

    public String addBinary(String a, String b) {

        final char[] charsOfA = a.toCharArray();
        final char[] charsOfB = b.toCharArray();

        StringBuilder result = new StringBuilder();

        int carry = 0;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int iOfA = a.length() - 1 - i;
            int iOfB = b.length() - 1 - i;

            int addendB = 0;
            if (iOfB >= 0) {
                addendB = charsOfB[iOfB] - '0';
            }

            int addendA = 0;
            if (iOfA >= 0) {
                addendA = charsOfA[iOfA] - '0';
            }

            int currentSum = addendA + addendB + carry;

            carry = 0;

            if (currentSum == 0) {
                result.insert(0, '0');
            } else if (currentSum == 1) {
                result.insert(0, '1');
            } else if (currentSum == 2) {
                result.insert(0, '0');
                carry = 1;
            } else {
                result.insert(0, '1');
                carry = 1;
            }
        }

        if (carry == 1) {
            result.insert(0, "1");
        }

        return result.toString();

    }

}
