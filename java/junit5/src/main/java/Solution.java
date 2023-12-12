public class Solution {

    private boolean isBadVersion(int x) {
        return x >=4;
    }

    public int firstBadVersion(int n) {

        int result = n;
        int left = 1;
        int right = n;
        int mid = (left+right)/2;

        while (left <= right) {
            boolean isMidBad = isBadVersion(mid);

            if (isMidBad) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = (left+right)/2;
        }
        return result;
    }

}
