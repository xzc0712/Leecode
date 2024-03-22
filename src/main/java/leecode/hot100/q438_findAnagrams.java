package leecode.hot100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


/**
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 */
public class q438_findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int slength = s.length();
        int plength = p.length();
        String temp = "";

        p = sortString(p);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < slength - plength + 1; i++) {
            //从当前处截取plength长度的字符
            temp = s.substring(i, i + plength);
            if (Objects.equals(sortString(temp), p)) {
                res.add(i);
            }
        }
        return res;
    }

    //重排序
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    @Test
    public void test() {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p).toString());
    }
}
