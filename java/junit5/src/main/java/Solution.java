import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        final Map<Integer, Integer> numToCount = new HashMap<>();

        int majorityNum = 0;
        int majorityNumCount = 0;

        for (int num : nums) {
            int numCount = numToCount.getOrDefault(num, 0);
            numCount++;
            numToCount.put(num, numCount);
            if (numCount > majorityNumCount) {
                majorityNumCount = numCount;
                majorityNum = num;
            }
        }

        return majorityNum;

    }

}
