package leecode.hot100;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 */
public class q15_threeSum {

    //想法：先固定好最小值作为定k值(初始为0)，left=k+1,right = nums.length -1
    // 如果k.v>0 退出循环
    // 如果三者之和大于0，则需要缩小，right--
    // 如果三者之和小于0，则需要增加，left++
    public List<List<Integer>> threeSum(int[] nums) {
        int k = 0;
        int left = k + 1;
        int right = nums.length - 1;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();


        //考虑全为0，全为负数整数的情况
        //if (nums[0] == 0 && nums[nums.length - 1] == 0) {
        //    List<Integer> oneRes = new ArrayList<>();
        //    oneRes.add(0);
        //    oneRes.add(0);
        //    oneRes.add(0);
        //    res.add(oneRes);
        //    return res;
        //} else if (nums[nums.length - 1] < 0) {
        //    return res;
        //}
        if (nums[nums.length - 1] < 0) {
                return res;
        }

        //当k.v>0时，跳出循环
        while (nums[k] <= 0) {
            //if (nums[k] == 0 &&  nums[k+1] == 0 && nums[k+2]==0) {
            //    List<Integer> oneRes = new ArrayList<>();
            //    oneRes.add(0);
            //    oneRes.add(0);
            //    oneRes.add(0);
            //    res.add(oneRes);
            //    break;
            //}
            while (left < right) {
                if (nums[k] + nums[left] + nums[right] == 0) {
                    List<Integer> oneRes = new ArrayList<>();
                    oneRes.add(nums[k]);
                    oneRes.add(nums[left]);
                    oneRes.add(nums[right]);
                    left++;
                    if (!res.contains(oneRes)) {
                        res.add(oneRes);
                    }
                } else if (nums[k] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[k] + nums[left] + nums[right] > 0) {
                    right--;
                }
            }
            // 考虑中间附带0，0，0的情况
            //重新赋值

            k++;
            left = k + 1;
            right = nums.length - 1;
        }
        return res;
    }

    @Test
    public void test() {
        int[] input = {-2,-3,0,0,-2};
        System.out.println(threeSum(input));
    }
}
