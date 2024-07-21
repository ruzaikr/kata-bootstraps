import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public int search(int[] nums, int target) {

        int leftPtr = 0;
        int rightPtr = nums.length - 1;

        while (leftPtr <= rightPtr) {
            int midPtr = (leftPtr + rightPtr) / 2;
            if (nums[midPtr] == target) {
                return midPtr;
            }
            if (target > nums[midPtr]) {
                leftPtr = midPtr + 1;
                continue;
            }
            rightPtr = midPtr - 1;
        }

        return -1;

    }

}
