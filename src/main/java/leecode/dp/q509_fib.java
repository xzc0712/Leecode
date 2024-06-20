package leecode.dp;

import org.junit.Test;

public class q509_fib {
    public int fib(int n) {
        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            //System.out.println(dp[i]);
        }
        return dp[n];
    }

    @Test
    public void test(){
        System.out.println(fib(3));
    }
}
