public class Solution {

    public int fib(int input) {

        if (input == 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        int[] dp = new int[input + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= input; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[input];

    }

}
