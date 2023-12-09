public class Solution {

    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }


        int maxProfit = 0;
        int l = 0;
        for (int r = 1; r < prices.length; r++) {

            int diff = prices[r] - prices[l];

            if (diff > 0) {
                if (diff > maxProfit) {
                    maxProfit = diff;
                }
            } else {
                l = r;
            }

        }

        return maxProfit;
    }

}
