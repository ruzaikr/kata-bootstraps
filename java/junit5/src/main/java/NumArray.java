public class NumArray {

    private final int[] prefixSumsNums;

    public NumArray(int[] nums) {

        prefixSumsNums = new int[nums.length];
        prefixSumsNums[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSumsNums[i] = prefixSumsNums[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int sum = prefixSumsNums[right];

        if (left > 0) {
            sum -= prefixSumsNums[left - 1];
        }
        return sum;
    }


}
