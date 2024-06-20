package leecode.hot100;

import org.junit.Test;

public class q198_rob {
    public int rob(int[] nums) {
        int[] dp = new int[101];
        int n = nums.length;
        //int res =0;

        if (n==0){
            return 0;
        }
        if (n==1){
            return nums[0];
        }
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0],nums[1]);

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i-1],dp[i-1]);
            //System.out.println("第"+i+"个dp为"+dp[i]);
        }
        return dp[n];
    }
    @Test
    public void test(){
        int[] input = new int[]{0};
        System.out.println(rob(input));
    }
}
