import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int coinChange(int[] coins, int amount) {

        final Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);

        for (int i = 1; i <= amount; i++) {
            int minNumCoinsNeeded = amount + 1;
            for (int coinDenomination : coins) {

                if (coinDenomination > i) {
                    continue;
                }

                if (coinDenomination == i) {
                    minNumCoinsNeeded = 1;
                    continue;
                }

                final int remainder = i - coinDenomination;
                if (!dp.containsKey(remainder)) {
                    throw new RuntimeException("boom!");
                }

                final int numCoinsNeeded = 1 + dp.get(remainder);
                minNumCoinsNeeded = Math.min(numCoinsNeeded, minNumCoinsNeeded);
            }
            dp.put(i, minNumCoinsNeeded);
        }

        final int output = dp.get(amount);

        if (output == amount + 1) {
            return -1;
        }

        return output;

    }

}
