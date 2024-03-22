package leecode.hot100;

import org.junit.Test;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。

 * 示例 1:

 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

public class q49_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // **:对于每个字符串，将其转换为字符数组并进行排序，然后将排序后的字符数组转换回字符串，并将其作为键存储在哈希表中

        Map<String,List<String>> res = new HashMap<>();

        for (String s : strs) {

            char[] charArray = s.toCharArray();         // eat 拆分成e,a,t
            Arrays.sort(charArray);
            String sortStr = new String(charArray);     // 将e，a，t进行排序为a,e,t  再组合起来为aet

            if (!res.containsKey(sortStr)){             // 第一次则新建
                res.put(sortStr,new ArrayList<>());
            }

            res.get(sortStr).add(s);
        }
        System.out.println("***"+res.values().toString());

        return new ArrayList<>(res.values());
        //return res.values();


        //return res;
    }


    @Test
    public void test() {
        // input
        String[] input =  {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = groupAnagrams(input);

        System.out.println(lists);
    }
}
