import java.util.Arrays;

public class Solution {

    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }

        if (nums.length > 1) {
            int sepIndex = nums.length / 2 - 1;

            int[] firstHalf = Arrays.copyOfRange(nums, 0, sepIndex + 1);
            int[] secondHalf = Arrays.copyOfRange(nums, sepIndex + 1, nums.length);

            if (search(firstHalf, target)) {
                return true;
            }
            if (search(secondHalf, target)) {
                return true;
            }
        }

        return nums[0] == target;
    }

}
