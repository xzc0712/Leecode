package leecode.hot100;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class q1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    @Test
    public void test() {
        // input
        int[] input =  {2,7,11,15};
        int target = 13;

        // excepted out put
        int[] output = {0,1};

        // res
        int[] res = twoSum(input, 9);
        assertArrayEquals(output,res);
        //assertEquals(output, res);
    }
}
