public class Solution {

    public int[] productExceptSelf(int[] nums) {

        final int[] output = new int[nums.length];
        output[0] = 1;
        output[1] = nums[0];

        int nameItLater1 = 1;
        for (int i = 0; i < (nums.length - 1); i++) {
            nameItLater1 = nums[i] * nameItLater1;
            output[i+1] = nameItLater1;
        }

        int nameItLater2 = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            nameItLater2 = nameItLater2 * nums[i+1];
            output[i] =  output[i] * nameItLater2;
        }

        return output;

    }

}
