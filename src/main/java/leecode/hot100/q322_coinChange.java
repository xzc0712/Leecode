package leecode.hot100;

import org.junit.Test;

public class q322_coinChange {
    public int coinChange(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount+1];

        for (int j = 0; j<dp.length ; j++) {
            dp[j] = max;
        }

        if (amount==0){
            return 0;
        }
        dp[0] = 0;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j-coins[i]]!=max){
                    dp[j] = Math.min(dp[j-coins[i]]+1,dp[j]);
                }

            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }

    @Test
    public void test(){
        int[] inputCoins = new int[]{2};
        int amount = 3;
        System.out.println(coinChange(inputCoins,amount));
    }
}
