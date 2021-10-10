import java.util.*;
题目描述
给你一个非空模板串S，一个文本串T，问S在T中出现了多少次
示例1
输入
复制
"ababab","abababab"
返回值
复制
2

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算模板串S在文本串T中出现了多少次
     * @param S string字符串 模板串
     * @param T string字符串 文本串
     * @return int整型
     */
    public int kmp (String S, String T) {
        // write code here
         int count = 0;
        if(S.length() > T.length()) {
            return 0;
        }
        for(int i = 0; i <= (T.length() - S.length()); i++) {
            if(S.equals(T.substring(i,i+S.length()))) {
                count++;
            }
        }
        return count;
    }
}