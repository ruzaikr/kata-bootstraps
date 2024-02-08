public class Solution {

    public int search(int[] nums, int target) {

        int leftPtr = 0;
        int rightPtr = nums.length - 1;
        int mid;

        do {

            mid = (leftPtr + rightPtr) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                leftPtr = mid + 1;
            } else {
                rightPtr = mid - 1;
            }

        } while (leftPtr <= rightPtr);

        return -1;
    }


}
