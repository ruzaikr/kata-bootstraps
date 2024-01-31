import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] TwoSum(int[] nums, int target) {

        final Map<Integer, Integer> numsToIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            final int diff = target - nums[i];

            if (numsToIndices.containsKey(diff)) {
                return new int[]{numsToIndices.get(diff), i};
            }

            numsToIndices.put(nums[i], i);

        }

        return new int[]{};


    }
}
