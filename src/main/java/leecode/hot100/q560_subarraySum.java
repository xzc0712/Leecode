package leecode.hot100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


/**
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 * <p>
 * 子数组是数组中元素的连续非空序列。
 * <p>
 * 示例 1：
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,3], k = 3
 * 输出：2
 */
public class q560_subarraySum {
    //纯暴力
    //有可能是负数
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int leng = nums.length;
        for (int i = 0; i < leng; i++) {

            if (i == leng - 1 && nums[i] == k) {
                res++;
                break;
            }

            int temp = nums[i];
            if (temp == k){
                res++;
                //continue;
            }

            for (int j = i + 1; j < leng; j++) {
                temp = temp + nums[j];
                if (temp == k) {
                    res++;
                    //break;
                }

            }
        }
        return res;

    }

    @Test
    public void test() {
        int[] a = {1,-1,0};
        int k = 0;
        System.out.println(subarraySum(a, k));
    }
}
