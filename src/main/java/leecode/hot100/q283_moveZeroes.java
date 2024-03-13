package leecode.hot100;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class q283_moveZeroes {

    public void moveZeroes2(int[] nums) {
        int left = 0;
        int right = 0;
        // [1]时超出时间限制，这样会要求必须有值为0
        //  发现left后一个永远会是0，存在的话
        //  在发现if和elseif重合了
        // 考虑[1,2,3,0]的情况，left一直不变
        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                //无论如何下一个都会是0
                left++;
            } else {
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public void moveZeroes(int[] nums) {

        // 思路:
        // 滑动指针，第一个指针指向第一个0；第二个指针指向第一个非0，然后做交换
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            // 只要右侧的数字不为0则交换
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));

    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    @Test
    public void test() {
        // input
        int[] input = {1, 2, 3};
        moveZeroes2(input);

    }
}
