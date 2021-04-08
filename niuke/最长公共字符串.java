import java.util.*;


public class Solution {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串给定两个字符串str1和str2,输出两个字符串的最长公共子串
	题目保证str1和str2的最长公共子串存在且唯一。
	示例1
	输入
	复制
	"1AB2345CD","12345EF"
	返回值
	复制
	"2345"
     */
	 
	 
	 
	 
	 public String LCS (String str1, String str2) {
        // write code here
        String res = "";
        int star = 0;
        int end = 1;
        while(end <= str2.length()) {
            String subStr = str2.substring(star,end);
            if(str1.contains(subStr)) {
                res = subStr;
            }else {
                star++;
            }
            end++;
        }
        return res;
    }
	 
	 
	 
	 
	 
	 
    public String LCS (String str1, String str2) {
        // write code here
        if(str1.length() < 1 || str2.length() < 1) {
            return null;
        }
        int indexMax = 0;
        int maxLen = 0;
        int m = str1.length();
        int n = str2.length();
        //dp[i] [j]代表 str1[0~i-1]和str2[0~j-1] 的最长公共子串的长度
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    if(i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }//else 是str1[i]!=str2[j]的情况,这种情况下dp[i][j]=0,由于初始化已经将其设置为0,所以这里不再写。
                }
                //处理完dp[i][j]之后,查看一下是否需要记录下来
                if(maxLen < dp[i][j]) {
                    maxLen = dp[i][j];
                    indexMax = i;//记录下出现“最长公共子串”时的末尾字符的位置
                }
            }
        }
        if(maxLen == 0) {
            return null;
        }
        return str1.substring(indexMax - maxLen + 1, indexMax + 1);
    }
}