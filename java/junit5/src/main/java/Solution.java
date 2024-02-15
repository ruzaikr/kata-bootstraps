public class Solution {

    public int[] productExceptSelf(int[] nums) {

        final int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        final int[] postfix = new int[nums.length];
        postfix[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i];
            postfix[nums.length - i -1] = postfix[nums.length - i] * nums[nums.length - i - 1];
        }

        final int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int prefixProduct = 1;
            if (i > 0) {
                prefixProduct = prefix[i-1];
            }
            int postfixProduct = 1;
            if (i < (nums.length - 1)) {
                postfixProduct = postfix[i+1];
            }
            output[i] = prefixProduct * postfixProduct;
        }

        return output;

    }

}
