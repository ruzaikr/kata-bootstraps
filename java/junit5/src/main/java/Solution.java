import java.util.*;

class Solution {

    /*
    *
    *
    * */


    public int search(int[] nums, int target) {

        int leftPtr = 0;
        int rightPtr = nums.length - 1;

        while (leftPtr <= rightPtr) {
            int midPtr = (leftPtr + rightPtr)/2;
            int mid = nums[midPtr];

            if (mid == target) {
                return midPtr;
            }

            int left = nums[leftPtr];
            int right = nums[rightPtr];


            if (mid >= left) {
                // mid is in the left sorted portion
                if (target < mid) {
                    if (target > left) {
                        rightPtr = midPtr - 1;
                    } else {
                        leftPtr = midPtr + 1;
                    }
                } else {
                    leftPtr = midPtr + 1;
                }

            } else {
                // mid is in the right sorted portion
                if (target < mid) {
                    rightPtr = midPtr - 1;
                } else {
                    if (target < right) {
                        leftPtr = midPtr + 1;
                    } else {
                        rightPtr = midPtr - 1;
                    }
                }

            }

        }

        if (leftPtr <= 0 || leftPtr >= nums.length) {
            return -1;
        }

        if (nums[leftPtr] != target) {
            return -1;
        }

        return leftPtr;

    }


}