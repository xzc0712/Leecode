package leecode.hot100;


import org.junit.Test;

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 * 示例 1：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 选（1，7）和（8，7）能够构成最高49
 * 输出：49
 */
public class q11_maxArea {
    //非暴力:采取滑动指针由两边往中间
    //关键在于：每轮需要向内移动短的木板，才能够保证最大面积
    public int maxArea2(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (area > res) {
                res = area;
            }
            //此处不能同时移动
            if (height[left] <= height[right]) {
                left++;
            } else right--;
        }

        return res;
    }

    //暴力:提交超出时间限制
    public int maxArea(int[] height) {
        int res = 0;
        // 坐标为(i,value)
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > res) {
                    res = area;
                }
            }
        }
        return res;
    }

    @Test
    public void test() {
        int[] input = {2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea2(input));
    }
}
