package leecode.hot100;

import org.junit.Test;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 * <p>
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class q3_lengthOfLongestSubstring {
    //暴力:如果现有的string中包含将要添加的，则找到已存在的并截取
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int res = 0;
        char[] c = s.toCharArray();
        String temp = "";

        for (int i = 0; i < length ; i++) {
            if (!temp.contains(String.valueOf(c[i]))) {
                //不包含新字符则添加
                temp = temp + c[i];
                if (temp.length() > res) {
                    res = temp.length();
                }
            } else {
                //包含了，则跳到相同字符之后的位置
                //dabca => bca
                int place = temp.indexOf(c[i]);
                temp = temp.substring(place + 1);
                temp = temp + c[i];

            }
        }
        return res;
    }

    @Test
    public void test() {
        String s = "abcabcbb";
        //String s = "aab";

        //System.out.println(s.substring(1));
        System.out.println(lengthOfLongestSubstring(s));
    }
}
