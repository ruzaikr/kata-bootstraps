public class Solution {

    public int search(int[] nums, int target) {

        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }

        int l = 0;
        int r = nums.length - 1;
        do {
            int mid = (l+r)/2;

            if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                return mid;
            }

        } while (l <= r);

        return -1;
    }

}
