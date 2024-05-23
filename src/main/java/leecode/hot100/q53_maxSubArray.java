package leecode.hot100;


/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组是数组中的一个连续部分。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大为 6 。
 */
public class q53_maxSubArray {
    // 暴力
    // 子数组的第一个数字一定是正数
    // 如果全为负数则是最大的负数
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        // 1. 如果当前数字是负数，且下一个数为正数 => 则舍去当前，取后一个数
        // 2. 如果当前数字是负数，且下一个还是负数，则取较大的负数
        // 3. 如果当前数字是正数，且下一个还是正数，则添加下一个数
        // 4. 如果当前数字是正数，且下一个是负数，若该负数小于正数，则取和视为正数
        //                                  若该负数大于正数，则跳过

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (nums[i] < 0 && nums[i + 1] > 0) {
                res = nums[i + 1];
                i = i + 1;
                continue;
            }
            if (nums[i]<0 && nums[i+1]<0){
                            }
        }
        return res;
    }
}
