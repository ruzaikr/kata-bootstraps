import java.util.*;

class Solution {

    /*
    *
    *
    * */


    public int search(int[] nums, int target) {

        int leftPtr = 0;
        int rightPtr = nums.length - 1;
        int last = nums[nums.length - 1];

        while (leftPtr < rightPtr) {
            int midPtr = (leftPtr + rightPtr)/2;
            int mid = nums[midPtr];

            if (mid > last) {
                leftPtr = midPtr + 1;
            } else {
                rightPtr = midPtr;
            }

        }

        int pivotIndex = leftPtr;

        if (pivotIndex == 0) {
            return binarySearch(nums, target);
        }

        int[] firstPortion = Arrays.copyOfRange(nums, 0, pivotIndex);
        int[] secondPortion = Arrays.copyOfRange(nums, pivotIndex, nums.length);

        int firstSearch = binarySearch(firstPortion, target);
        int secondSearch = binarySearch(secondPortion, target);

        if (firstSearch == -1 && secondSearch == -1) {
            return -1;
        } else if (firstSearch == -1) {
            return secondSearch + pivotIndex;
        }

        return firstSearch;

    }

    private int binarySearch(int[] nums, int target) {

        int leftPtr = 0;
        int rightPtr = nums.length - 1;

        while (leftPtr <= rightPtr) {
            int midPtr = (leftPtr + rightPtr)/2;
            int mid = nums[midPtr];

            if (target > mid) {
                leftPtr = midPtr + 1;
            } else if (target < mid) {
                rightPtr = midPtr - 1;
            } else {
                return midPtr;
            }
        }

        return -1;

    }


}