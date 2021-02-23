package com.luo.leetcode.leetcode1_100;

import java.util.Arrays;
import java.util.List;

/**
 * 最后一个单词的长度
 *
 * @author luoxusheng 2020/7/26 17:43
 * @version 1.0.0
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test58_Solution {

    public static int lengthOfLastWord(String s) {
        if(s.length() <= 0){
            return 0;
        }
        if(!s.contains(" ")){
            return s.length();
        }
        String[] s1 = s.split(" ");
        if(s1.length == 0){
            return 0;
        }
        List<String> strings = Arrays.asList(s.split(" "));
        return strings.get(s1.length - 1).length();
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("Hello World"));
        String[] s = " ".split(" ");
        System.out.println(s.toString());
    }

}
