public class Solution {

    public int climbStairs(int n) {

        return getNoOfWays(n, 0, 0);

    }

    private int getNoOfWays(int n, int current, int noOfWays) {
        if (current == n) {
            return noOfWays + 1;
        }

        if (current > n) {
            return noOfWays;
        }

        noOfWays = getNoOfWays(n, current + 1, noOfWays);
        noOfWays = getNoOfWays(n, current + 2, noOfWays);

        return noOfWays;
    }

}
