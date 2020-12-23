public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if(str == null && pattern == null) {
            return true;
        }
        return matchHelp(str,0,pattern,0);
    }
    
     /* 讨论2种：先看 * 再看 匹配
     * 前提：当pattern遍历完，return取决于str是否遍历完，str恰好遍历完才返回true，再接下来讨论
     *  1.若当前字符存在下一个字符，看下一个字符是否是 '*'，如果是，有2种情况
     *      一：当前匹配
     *      1.1match(str,i + 1,pattern,j)//跳过str
     *      1.2match(str,i,pattern,j + 2)//跳过pattern
     *      1.3match(str,i + 1,pattern,j + 2)//这一种可以省略，相当于 1.1 + 1.2
     *      二：当前不匹配
     *      match(str,i,pattern,j + 2)//跳过pattern
     * 2.下一个不是 *
     *     当前匹配 return match(str,i + 1,pattern,j + 1)
     */
    private boolean matchHelp(char[] str,int i,char[] pattern,int j) {
        if(j == pattern.length) {//检验是否都匹配完了
            return i == str.length;
        }
        if(j < pattern.length - 1 &&  pattern[j+1] == '*') {
            if(str.length != i && //匹配
              (str[i] == pattern[j] || pattern[j] == '.')) {
                return matchHelp(str,i + 1,pattern,j) || matchHelp(str,i,pattern,j + 2);
            }else {
                return matchHelp(str,i,pattern,j+2);
            }
        }
        if(str.length != i && (str[i] == pattern[j] || pattern[j] == '.')) {
            return matchHelp(str,i+1,pattern,j+1);
        }
        return false;
    }
}