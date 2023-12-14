public class Solution {

    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int currentSum = nums[0];
        int largestSum = currentSum;

        int ptr = 1;
        while (ptr < nums.length) {

            if (nums[ptr] < 0 && Math.abs(nums[ptr]) > Math.abs(currentSum) && ptr < (nums.length -1)) {
                ptr += 1;
                currentSum = nums[ptr];
            } else if (nums[ptr] <= 0 && currentSum < 0 && nums[ptr] > currentSum) {
                currentSum = nums[ptr];
            } else if (nums[ptr] > 0 && currentSum < 0) {
                currentSum = nums[ptr];
            } else {
                currentSum += nums[ptr];
            }

            if (currentSum > largestSum) {
                largestSum = currentSum;
            }

            ptr += 1;
        }

        return largestSum;
    }

}
