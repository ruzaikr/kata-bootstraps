import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] getIndices(int target, int[] nums) {
        Map<Integer, Integer> numberToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numberToIndex.containsKey(diff)) {
                return new int[]{i, numberToIndex.get(diff)};
            }
            numberToIndex.put(nums[i], i);
        }

        return null;
    }
}
