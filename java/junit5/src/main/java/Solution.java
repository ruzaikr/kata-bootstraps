public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        int mPtr = m - 1;
        int nPtr = n - 1;

        int i = m + n -1;

        while (mPtr >= 0 && nPtr >= 0) {
            if (nums2[nPtr] >= nums1[mPtr]) {
                nums1[i] = nums2[nPtr];
                nPtr--;
            } else {
                nums1[i] = nums1[mPtr];
                mPtr--;
            }
            i--;
        }

        while (nPtr >= 0) {
            nums1[i] = nums2[nPtr];
            nPtr--;
            i--;
        }

    }



}
