package leecode.hot100;

import org.junit.Test;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class q169_majorityElement {
    // 方法一： 摩尔投票
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1;i<nums.length;i++) {
            if (count == 0){
                res = nums[i];
            }
            if (nums[i] == res){
                count++;
            }else {
                count--;
            }

        }
        return res;
    }

    @Test
    public void test(){
        int[] a  = new int[]{2,2,1,1,1,2,2};
        int[] b  = new int[]{3,2,3};
        System.out.println(majorityElement(b));
    }
}
