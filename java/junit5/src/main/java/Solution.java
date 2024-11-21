import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numToIndex.containsKey(diff)) {
                return new int[]{i, numToIndex.get(diff)};
            }
            numToIndex.put(nums[i], i);
        }
        return null;
    }

}